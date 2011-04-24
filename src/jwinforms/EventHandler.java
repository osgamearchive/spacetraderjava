package jwinforms;


abstract public class EventHandler<Sender, Args> {
  abstract public void handle(Sender sender, Args e);
}
