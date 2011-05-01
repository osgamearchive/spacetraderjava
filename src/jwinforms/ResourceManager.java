package jwinforms;
import java.net.URL;
import java.util.Properties;


public class ResourceManager {
  private static final ClassLoader classLoader = ResourceManager.class.getClassLoader();
  private final String path;
  protected final Properties properties = new Properties();

  protected ResourceManager(URL url, String s) {
    try {
      properties.load(url.openStream());
      path = s;
    } catch(Exception e) {
      throw new Error(e.getMessage() + ": trying to load url \"" + url + "\"", e);
    }
  }

  public ResourceManager(Class<?> c) {
    this(classLoader.getResource(classToPath(c) + c.getSimpleName() + ".properties"), classToPath(c));
  }

  private static String classToPath(Class<?> c) {
    String path = c.getCanonicalName().replace('.', '/');
    return path.substring(0, path.lastIndexOf('/') + 1);
  }

  public Object GetObject(String s) {
    String objectType = properties.getProperty(s + ".type", null);
    if(objectType == null) {
      throw new Error("No object type for: " + s);
    }
    if(objectType.equals("ImageListStreamer")) {
      // value is name of properties file with image names in it
      String streamFilename = properties.getProperty(s);
      try {
        return new ImageStreamResourceManager(classLoader.getResource(path + streamFilename), path).getStream();
      } catch(NullPointerException e) {
        throw new Error("NPE while seeking for " + streamFilename);
      }
    } else if(objectType.equals("Image")) {
      String imageName = properties.getProperty(s);
      return getImage(imageName);
    } else {
      throw new Error("Uknown object type " + objectType);
    }
  }

  public Object getImage(String s) {
    return new Bitmap(classLoader.getResource(s.trim()));
  }

  public String GetString(String s) {
    return properties.getProperty(s);
  }
}
