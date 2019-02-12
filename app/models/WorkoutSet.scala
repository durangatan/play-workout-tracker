package models

final case class WorkoutSet(exercise: Exercise, weight: Int, reps: Int, notes: Option[String])

import EastBankClubExercises._

// A simple vector storing the default workout sets
// maybe replace with db later



object EastBankClubSets {

  lazy val default = Vector(
    WorkoutSet(LegPress, 60, 6, Some("Warmup")),
    WorkoutSet(LegPress, 110, 12, None),
    WorkoutSet(LegPress, 110, 12, None),
    WorkoutSet(LegPress, 110, 12, None),

    WorkoutSet(HipAbduction, 100, 20, None),
    WorkoutSet(HipAdduction, 115, 20, None),
    WorkoutSet(HipAbduction, 100, 20, None),
    WorkoutSet(HipAdduction, 115, 20, None),
    WorkoutSet(HipAbduction, 100, 20, None),
    WorkoutSet(HipAdduction, 115, 20, None),

    WorkoutSet(ChestPress, 55, 6, Some("Warmup")),
    WorkoutSet(ChestPress, 110, 12, None),
    WorkoutSet(Row, 70, 6, Some("Warmup")),
    WorkoutSet(Row, 100, 12, None),
    WorkoutSet(ChestPress, 110, 12, None),
    WorkoutSet(Row, 100, 12, None),
    WorkoutSet(ChestPress, 110, 12, None),
    WorkoutSet(Row, 100, 12, None),

    WorkoutSet(OverheadPress, 50, 6, Some("Warmup")),
    WorkoutSet(OverheadPress, 80, 12, None),
    WorkoutSet(Pulldown, 50, 6, Some("Warmup")),
    WorkoutSet(Pulldown, 90, 12, None),
    WorkoutSet(OverheadPress, 80, 12, None),
    WorkoutSet(Pulldown, 90, 12, None),
    WorkoutSet(OverheadPress, 80, 12, None),
    WorkoutSet(Pulldown, 90, 12, None),

    WorkoutSet(TricepExtension, 60, 12, None),
    WorkoutSet(BicepCurl, 65, 12, None),
    WorkoutSet(TricepExtension, 60, 12, None),
    WorkoutSet(BicepCurl, 65, 12, None),
    WorkoutSet(TricepExtension, 60, 12, None),
    WorkoutSet(BicepCurl, 65, 12, None),

    WorkoutSet(Crunch, 95, 20, None),
    WorkoutSet(Crunch, 95, 20, None),
    WorkoutSet(Crunch, 95, 20, None),

    WorkoutSet(LateralTorso, 90, 20, None),
    WorkoutSet(LateralTorso, 90, 20, None),
    WorkoutSet(LateralTorso, 90, 20, None)
  )
}