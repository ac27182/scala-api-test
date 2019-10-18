package api
import org.http4s.Http4s
import cats.effect.IOApp
import cats.effect.ExitCode
import cats.effect.IO
import org.http4s.server.blaze.BlazeServerBuilder

object Main extends IOApp {
  def run(args: List[String]) = {

    BlazeServerBuilder[IO].bindHttp(9000, "0.0.0.0").dr

  }
}
