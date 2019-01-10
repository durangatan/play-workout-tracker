package models

class Exercise(val machineNumber: Option[Int], name: String, val seatSetting: Option[String], val rangeSetting: Option[String], val notes: Option[String]){
  override def toString() = name
}


// A simple vector storing the default workout sets
// maybe replace with db later


object EastBankClubExercises {

  lazy val LegPress = new Exercise(Some(20), "Leg Press", Some("3"), Some("4"), None)
  lazy val HipAbduction = new Exercise(Some(29), "Hip Abduction", None, None, Some("Start with levers fully closed"))
  lazy val HipAdduction = new Exercise(Some(30), "Hip Adduction", None, None, Some("Open to slight stretch initially"))
  lazy val ChestPress = new Exercise(Some(10), "Chest Press", Some("3"), Some("3"), None)
  lazy val Row = new Exercise(Some(9), "Row", Some("5"), Some("3"), Some("Ankles behind knees"))
  lazy val OverheadPress = new Exercise(Some(12), "Overhead Press", Some("5"), None, Some("Palms facing in"))
  lazy val Pulldown = new Exercise(Some(11), "Pulldown", None, None, Some("Set knee pads first"))
  lazy val TricepExtension = new Exercise(Some(13), "Tricep Extensions", None, None, Some("Elbows to pads after start"))
  lazy val BicepCurl = new Exercise(Some(14), "Bicep Curl", None, None, Some("Elbows to pads"))
  lazy val Crunch = new Exercise(None, "Abdominal Crunch", None, Some("5"), Some("Bellybutton to dot"))
  lazy val LateralTorso = new Exercise(None, "Lateral Torso", None, None, Some("chest and knees at 5"))

}