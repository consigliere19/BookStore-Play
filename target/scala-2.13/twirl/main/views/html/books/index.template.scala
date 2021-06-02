
package views.html.books

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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Set[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(books: Set[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""
"""),format.raw/*2.1*/("""<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>All Books</title>
</head>
<body>
    <ul>
    """),_display_(/*9.6*/for(book <- books) yield /*9.24*/ {_display_(Seq[Any](format.raw/*9.26*/("""
        """),format.raw/*10.9*/("""<li>
            <span>"""),_display_(/*11.20*/book/*11.24*/.title),format.raw/*11.30*/("""</span>
            <span>"""),_display_(/*12.20*/book/*12.24*/.author),format.raw/*12.31*/("""</span>
            <span>"""),_display_(/*13.20*/book/*13.24*/.price),format.raw/*13.30*/("""</span>
        </li>
        """)))}),format.raw/*15.10*/("""
    """),format.raw/*16.5*/("""</ul>
</body>
</html>"""))
      }
    }
  }

  def render(books:Set[Book]): play.twirl.api.HtmlFormat.Appendable = apply(books)

  def f:((Set[Book]) => play.twirl.api.HtmlFormat.Appendable) = (books) => apply(books)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/books/index.scala.html
                  HASH: 151d28fedc21745db0e8fb3f426cf03093015e02
                  MATRIX: 916->1|1029->19|1057->21|1198->137|1231->155|1270->157|1307->167|1359->192|1372->196|1399->202|1454->230|1467->234|1495->241|1550->269|1563->273|1590->279|1654->312|1687->318
                  LINES: 27->1|32->1|33->2|40->9|40->9|40->9|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|46->15|47->16
                  -- GENERATED --
              */
          