package learning

import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}

package object slick {

  implicit class FutureOps[A](future: Future[A]) {
    def get: A = Await.result(future, Duration.Inf)
  }


}
