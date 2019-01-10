package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models._
import scala.util.{Try, Success, Failure}

@Singleton
class WorkoutController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def endScreen() = Action { implicit request: Request[AnyContent] => {
    val (totalWeight, totalSets) = EastBankClubSets.default.
      foldLeft[Tuple2[Int, Int]]((0, 0))((acc, set) => (acc._1 + set.weight, acc._2 + 1))
    Ok(views.html.endscreen(totalWeight, totalSets))
    }
  }
}
