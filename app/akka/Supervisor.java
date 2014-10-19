package akka;

import akka.actor.*;
import scala.concurrent.duration.Duration;
import java.util.concurrent.TimeUnit;

/**
 * Supervisor initiating Romeo and Juliet actors and scheduling their talking
 */
public class Supervisor extends UntypedActor {

  private final ActorRef robin;
  private final ActorRef batman;

  public Supervisor() {
    this.robin = context().actorOf(Props.create(Chatter.class, () -> new Chatter("Robin", Quotes.robin)));
    context().system().scheduler().schedule(
      Duration.apply(1, TimeUnit.SECONDS),
      Duration.apply(8, TimeUnit.SECONDS),
      robin, ChatActors.TALK,
      getContext().dispatcher(), self());

    this.batman = context().actorOf(Props.create(Chatter.class, () -> new Chatter("Batman", Quotes.batman)));
    context().system().scheduler().schedule(
      Duration.apply(1, TimeUnit.SECONDS),
      Duration.apply(8, TimeUnit.SECONDS),
      batman, ChatActors.TALK,
      getContext().dispatcher(), self());
  }

  public void onReceive(Object message) throws Exception {}
}
