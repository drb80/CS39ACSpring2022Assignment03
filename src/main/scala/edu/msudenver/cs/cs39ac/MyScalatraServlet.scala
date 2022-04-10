package edu.msudenver.cs.cs39ac

import org.scalatra._

class MyScalatraServlet extends ScalatraServlet {
  get("/:URL") {
    contentType = "text/html"
    "<html><body>Request URL: " + params("URL") + "</body></html>"
  }
}
