package models

import play.api.mvc.Call

case class TeamMember(name: String, job: String, desc: String, imageURL: Call, links: List[Link]) {
	val id: String = name.replaceAll("\\s", "")
}
