package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models._
import scala.util.{Try, Success, Failure}
/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's set page.
 */
@Singleton
class SetController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def show(id: Int) = Action { implicit request: Request[AnyContent] => {
      val setTry = Try(EastBankClubSets.default(id))
      val set = setTry match {
        case Success(set) => Some(set)
        case Failure(_) => None
      }

      val nextUpTry = Try(EastBankClubSets.default(id + 1))
      val nextUp = nextUpTry match {
        case Success(nextSet) => Some(nextSet)
        case Failure(_) => None
      }

         Ok(views.html.set(set, nextUp, id + 1))
    }
  }
}
