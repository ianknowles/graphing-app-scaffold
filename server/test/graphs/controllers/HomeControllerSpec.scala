package graphs.controllers

import com.typesafe.config.ConfigFactory
import org.scalatestplus.play._
import org.scalatestplus.play.guice._
import org.webjars.play.WebJarsUtil
import play.api.Configuration
import play.api.mvc.{AnyContentAsEmpty, Result}
import play.api.test.Helpers._
import play.api.test._
import play.mvc.Http

import scala.concurrent.Future

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 *
 * For more information, see https://www.playframework.com/documentation/latest/ScalaTestingWithScalaTest
 */
class HomeControllerSpec extends PlaySpec with GuiceOneAppPerTest with Injecting {
	val headers: FakeHeaders = FakeHeaders(Seq(Http.HeaderNames.HOST -> "playapp"))

	"HomeController GET" should {

		"render the index page from a new instance of controller" in {
			implicit val webJarsUtil: WebJarsUtil = app.injector.instanceOf[WebJarsUtil]
			val controller: HomeController = new HomeController(stubControllerComponents(), Configuration(ConfigFactory.load()))
			val home: Future[Result] = controller.index().apply(FakeRequest(GET, "/").withHeaders(headers))

			status(home) mustBe OK
			contentType(home) mustBe Some("text/html")
			contentAsString(home) must include ("index.jumbo.title")
		}

		"render the index page from the application" in {
			val controller: HomeController = inject[HomeController]
			val home: Future[Result] = controller.index().apply(FakeRequest(GET, "/").withHeaders(headers))

			status(home) mustBe OK
			contentType(home) mustBe Some("text/html")
			contentAsString(home) must include ("jumbo.title")
		}

		"render the index page from the router" in {
			val request: FakeRequest[AnyContentAsEmpty.type] = FakeRequest(GET, "/").withHeaders(headers)
			val home: Future[Result] = route(app, request).get

			status(home) mustBe OK
			contentType(home) mustBe Some("text/html")
			contentAsString(home) must include ("jumbo.title")
		}
	}
}
