package models

final case class WorkoutSet(exercise: Exercise, weight: Int, reps: Int, notes: Option[String])

import EastBankClubExercises._

// A simple vector storing the default workout sets
// maybe replace with db later



object EastBankClubSets {

  lazy val default = Vector(
    WorkoutSet(LegPress, 60, 6, Some("Warmup")),
    WorkoutSet(LegPress, 90, 12, None),
    WorkoutSet(LegPress, 90, 12, None),
    WorkoutSet(LegPress, 90, 12, None),

    WorkoutSet(HipAbduction, 90, 20, None),
    WorkoutSet(HipAdduction, 110, 20, None),
    WorkoutSet(HipAbduction, 90, 20, None),
    WorkoutSet(HipAdduction, 110, 20, None),
    WorkoutSet(HipAbduction, 90, 20, None),
    WorkoutSet(HipAdduction, 110, 20, None),

    WorkoutSet(ChestPress, 50, 6, Some("Warmup")),
    WorkoutSet(ChestPress, 90, 12, None),
    WorkoutSet(Row, 70, 6, Some("Warmup")),
    WorkoutSet(Row, 90, 12, None),
    WorkoutSet(ChestPress, 90, 12, None),
    WorkoutSet(Row, 90, 12, None),
    WorkoutSet(ChestPress, 90, 12, None),
    WorkoutSet(Row, 90, 12, None),

    WorkoutSet(OverheadPress, 50, 6, Some("Warmup")),
    WorkoutSet(OverheadPress, 70, 12, None),
    WorkoutSet(Pulldown, 50, 6, Some("Warmup")),
    WorkoutSet(Pulldown, 60, 12, None),
    WorkoutSet(OverheadPress, 70, 12, None),
    WorkoutSet(Pulldown, 60, 12, None),
    WorkoutSet(OverheadPress, 70, 12, None),
    WorkoutSet(Pulldown, 60, 12, None),

    WorkoutSet(TricepExtension, 40, 12, None),
    WorkoutSet(BicepCurl, 40, 12, None),
    WorkoutSet(TricepExtension, 40, 12, None),
    WorkoutSet(BicepCurl, 40, 12, None),
    WorkoutSet(TricepExtension, 40, 12, None),
    WorkoutSet(BicepCurl, 40, 12, None),

    WorkoutSet(Crunch, 95, 20, None),
    WorkoutSet(Crunch, 95, 20, None),
    WorkoutSet(Crunch, 95, 20, None),

    WorkoutSet(LateralTorso, 90, 20, None),
    WorkoutSet(LateralTorso, 90, 20, None),
    WorkoutSet(LateralTorso, 90, 20, None)
  )
}