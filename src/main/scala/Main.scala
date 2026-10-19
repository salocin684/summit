@main def run(): Unit =
  val start = GameState(altitude = 3800, energy = 100, day = 1)
  println(start)

  val higher = start.copy(
    altitude = start.altitude + 100,
    energy = start.energy - 10
  )
  println(higher)
  println(start)