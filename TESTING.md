# Setup

## Command line
* Install `JDK` from https://adoptopenjdk.net/
* Install `SBT` from https://www.scala-sbt.org/download.html
* Run the `SBT` command in a shell.
* After the SBT shell has loaded use the `run` command.
* Browse to `http://localhost:9000`

## IntelliJ
* Install the [Scala language plugin](https://plugins.jetbrains.com/plugin/1347-scala). This plugin requires IntelliJ, other Jetbrains IDEs are not supported.
* You will need to set the project SDK to a `JDK`, https://www.jetbrains.com/help/idea/sdk.html#set-up-jdk.
* The scala plugin will install a managed version of `SBT`, you can optionally reconfigure the project to use a standalone install.
* When you open the project folder in IntelliJ it will need to build the project structure definitions from the `build.sbt` definition. Any changes to `build.sbt` require a new build of the project structure.
* Open the `sbt shell` tool, usually accesible via a tool tab at the bottom of window.
* After the SBT shell has loaded use the `run` command.
* Browse to `http://localhost:9000`

# Debugging
* Exceptions will be printed to both the `sbt shell` and shown as static error pages in the browser.
* To debug the play application, debug mode needs to be enabled for the `sbt shell`. The shell can then be relaunched as a debug session.
* Use a browser's developer tools to debug javascript and scala.js sources. `Firefox Developer Edition` is recommended, `F12` key opens the dev tools.
* Application log is saved to [server/logs/application.log](server/logs/application.log)
