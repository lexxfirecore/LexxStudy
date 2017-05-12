/**
  * Created by alexandruco on 1/23/2017.
  */

val person_json =
  """{
      "name": "Joe Doe",
      "age": 45,
      "kids": ["Frank", "Marta", "Joan"]
      }"""

val person = scala.util.parsing.json.JSON.parseFull(person_json)

// returns "Joe Doe"
person match {
  case Some(m: Map[String, Any]) => m("name") match {
    case s: String => s
  }
}

object Demo {

  def main(args: Array[String]): Unit = {
      match
  }
}
