
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wilson/1-MyProjects/casino-backend/conf/routes
// @DATE:Sun Oct 15 15:41:54 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
