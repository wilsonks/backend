
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wilson/workspace1/backend/conf/routes
// @DATE:Sun Oct 15 17:39:11 IST 2017


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
