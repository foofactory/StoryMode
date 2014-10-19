package akka;

import akka.actor.*;

public class ChatActors {

  /** SSE-Chat actor system */
  private static ActorSystem system = null;

  /** Supervisor for Batman and Robin */
  private static ActorRef supervisor = null;

  public static void start() {
    if(system == null) {
      system = ActorSystem.create("sse-chat");
      supervisor = system.actorOf(Props.create(Supervisor.class, Supervisor::new));
    }
  }

  public static void stop() {
    if(system != null)
      system.shutdown();
  }

  /** Talk event **/
  public static final Object TALK = new Object();
}
