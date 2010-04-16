package spacetrader.stub;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class BinaryFormatter
{

	public Object Deserialize(InputStream inStream) throws SerializationException, IOException
	{
		try
		{
			return new ObjectInputStream(inStream).readObject();
		} catch (ClassNotFoundException e)
		{
			throw new SerializationException(e);
		}
	}

	public void Serialize(OutputStream outStream, Object toSerialize) throws IOException
	{
		new ObjectOutputStream(outStream).writeObject(toSerialize);
	}

}
