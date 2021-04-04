# Setup

* Install a ***JDK*** from https://adoptopenjdk.net/.

## Setup for command line

* Install ***sbt*** from https://www.scala-sbt.org/download.html.

## Setup for IntelliJ

* Install the [Scala language plugin](https://plugins.jetbrains.com/plugin/1347-scala). This plugin requires
	***IntelliJ***, other Jetbrains IDEs are not supported. ***Community edition*** will enable debugging and syntax
	highlighting in the project and support for Scala, while ***Ultimate edition*** will additionally enable full support
	for Play framework, HTML, CSS, SCSS, Javascript and Scala.js.
* Set the ***project SDK*** to the installed ***JDK***, https://www.jetbrains.com/help/idea/sdk.html#set-up-jdk.
* The scala plugin will install a managed version of ***sbt***, you can optionally reconfigure the project to use a
	standalone installation.
* Import the project folder from Github as a sbt project.
	> _Note_: Future versions of sbt and the scala plugin, will switch to importing as a BSP project. The first releases
	> claiming BSP support required standalone sbt installs (fixed) and did not correctly regenerate project structure
	> definitions on changes to `build.sbt`.
* When you open the project folder in ***IntelliJ*** it will need to build the project structure definitions from the
	`build.sbt` definition. Any changes to `build.sbt` require a new build of the project structure.

# Running the application

* Launch the ***sbt shell***
	* ***command line***: Run the `sbt` command.
	* ***IntelliJ***: Open the ***sbt shell*** tool, usually accessible via a tool tab at the bottom of window.
* After the ***sbt shell*** has loaded use the `run` command.
* Browse to http://localhost:9000.

# Debugging

* Exceptions will be printed to both the ***sbt shell*** and shown as static error pages in the browser.
* To debug the play application, debug mode needs to be enabled for the ***sbt shell*** in ***IntelliJ***. The shell can
	then be relaunched as a debug session.
* Use a browser's developer tools to debug javascript and scala.js sources. ***Firefox Developer Edition*** is
	recommended, `F12` key opens the dev tools in most browsers.
* The Play application log is saved to [server/logs/application.log](server/logs/application.log).
