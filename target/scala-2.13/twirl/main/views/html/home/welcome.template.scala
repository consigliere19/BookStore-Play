
package views.html.home

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object welcome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(firstName: String, lastName: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.39*/("""
"""),format.raw/*2.1*/("""<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h2>Welcome """),_display_(/*8.14*/firstName),format.raw/*8.23*/(""" """),_display_(/*8.25*/lastName),format.raw/*8.33*/(""" """),format.raw/*8.34*/("""to our website</h2>
</body>
</html>"""))
      }
    }
  }

  def render(firstName:String,lastName:String): play.twirl.api.HtmlFormat.Appendable = apply(firstName,lastName)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (firstName,lastName) => apply(firstName,lastName)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/home/welcome.scala.html
                  HASH: 5c79194fdc311ef65206f102f55e56a1b005451d
                  MATRIX: 921->1|1053->38|1081->40|1217->150|1246->159|1274->161|1302->169|1330->170
                  LINES: 27->1|32->1|33->2|39->8|39->8|39->8|39->8|39->8
                  -- GENERATED --
              */
          