# Setup
The ***Scala*** language extends the ***Java*** language with improvements to language features and syntax. While it
supports javascript and native runtime environments the primary runtime environment is the ***JRE***, developing for the
***JRE*** requires a ***JDK*** install. Some options for installation follow.
* Install a standalone [JDK](https://adoptopenjdk.net/).
	> https://adoptopenjdk.net/installation.html
* Managing multiple versions of the ***JDK*** can be done from terminals using ***SDKMAN!***.
	> https://sdkman.io/install

	> https://sdkman.io/jdks#AdoptOpenJDK
* When using ***IntelliJ IDEA*** you can use it to manage ***JDK*** installs from the settings dialogue.
	> https://www.jetbrains.com/help/idea/sdk.html#jdk-from-ide

## Setup for command line
***Scala*** projects use ***sbt*** as a portable build tool that can be used standalone or with an IDE.
* Install [sbt][sbt download].
	> https://www.scala-sbt.org/1.x/docs/Setup.html

## Setup for IntelliJ IDEA
***IntelliJ IDEA*** is a commercial IDE with free support for Scala, and free upgrades to its commercial edition for
academic users.
* Install [IntelliJ IDEA](https://www.jetbrains.com/idea/download/).
	> https://www.jetbrains.com/help/idea/installation-guide.html
* Install the [Scala language plugin](https://plugins.jetbrains.com/plugin/1347-scala).
	> https://www.jetbrains.com/help/idea/discover-intellij-idea-for-scala.html

	> This plugin requires ***IntelliJ***, other Jetbrains IDEs are not supported. ***Community edition*** will enable
	> debugging and syntax highlighting in the project and support for Scala, while ***Ultimate edition*** will
	> additionally enable full support for Play framework, HTML, CSS, SCSS, Javascript and Scala.js.
* Optionally, install a ***JDK*** managed by ***IntelliJ***.
	> https://www.jetbrains.com/help/idea/sdk.html#jdk-from-ide
* Set the ***project SDK*** to the installed ***JDK***.
	> https://www.jetbrains.com/help/idea/sdk.html#set-up-jdk
* The scala plugin will install a managed version of ***sbt***, you can optionally reconfigure the project to use a
	[standalone installation][sbt download] by changing the ***sbt launcher*** location setting.
	> https://www.jetbrains.com/help/idea/sbt.html
* Import the project folder from Github as a ***sbt*** project.
	> https://www.jetbrains.com/help/idea/manage-projects-hosted-on-github.html#clone-from-GitHub

	> https://www.jetbrains.com/help/idea/sbt-support.html#import_sbt

	> _Note_: Future versions of ***sbt*** and the ***Scala*** plugin, will switch to importing as a
	> [BSP project](https://www.jetbrains.com/help/idea/bsp-support.html). The first releases claiming ***BSP*** support
	> required standalone sbt installs (fixed) and did not correctly regenerate project structure definitions on changes
	> to `build.sbt`.
* When you open the project folder in ***IntelliJ*** it will need to build the project structure definitions from the
	`build.sbt` definition. Any changes to `build.sbt` require a new build of the project structure.
	> https://www.jetbrains.com/help/idea/sbt-support.html#manage_sbt_projects

## Alternatives to IntelliJ
The project build, structure, and dependencies are defined in `build.sbt`, any Scala IDE can interact with ***sbt*** to 
build and run the project, and generate structure definitions and dependency lists. The following alternatives can be
used:
* [ScalaIDE](http://scala-ide.org/)
	> ***ScalaIDE*** is built on ***Eclipse*** a popular open source IDE. The project can be imported without changes as a
	> ***sbt*** project. There are some ***IntelliJ*** config files in the repository that define code style choices and
	> version control system choice. It is untested whether the ***Eclipse Interoperability*** plugin can export these
	> settings. The primary concern of the plugin is project structure and module definitions which should not be exported
	> as these are generated from `build.sbt`.
* [Metals](https://scalameta.org/metals/)
	> ***Metals*** is a language server, this allows any text editor to communicate with it and access language support.
	> This allows plugins to be developed that are compatible with any text editor that implements the language server
	> protocol. ***Metals*** can be used with ***Visual Studio Code***, ***Eclipse***, ***Vim***, ***Emacs***, ***Sublime
	> Text***.

# Running the application
* Launch the ***sbt shell***
	* ***command line***: Run the `sbt` command.
		> https://www.scala-sbt.org/1.x/docs/Running.html#sbt+shell
	* ***IntelliJ***: Open the ***sbt shell*** tool, usually accessible via a tool tab at the bottom of window.
		> https://www.jetbrains.com/help/idea/sbt-support.html#sbt_shell
* After the ***sbt shell*** has loaded use the `run` command.
	> https://www.playframework.com/documentation/2.8.x/PlayConsole
* Browse to http://localhost:9000.
	> https://www.playframework.com/documentation/2.8.x/NewApplication#Scala-template

# Debugging
* Exceptions will be printed to both the ***sbt shell*** and shown as static error pages in the browser.
	> https://www.playframework.com/documentation/2.8.x/ScalaErrorHandling
* To debug the play application, debug mode needs to be enabled for the ***sbt shell*** in ***IntelliJ***. The shell can
	then be relaunched as a debug session.
	> https://www.jetbrains.com/help/idea/run-debug-and-test-scala.html#debug_scala_code

	> https://www.playframework.com/documentation/2.8.x/sbtDebugging#Debugging-your-build
* Use a browser's developer tools to debug javascript and scala.js sources. ***Firefox Developer Edition*** is
	recommended, `F12` key opens the dev tools in most browsers.
	> https://developer.mozilla.org/en-US/docs/Tools
* The Play application log is saved to [server/logs/application.log](../server/logs/application.log).
	> https://www.playframework.com/documentation/2.8.x/Anatomy#The-Play-application-layout

[sbt download]: https://www.scala-sbt.org/download.html