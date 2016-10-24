package demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 152658F on 10/24/2016.
 */
@WebServlet(name = "BookCatalogServlet", urlPatterns = "/bookcatalog")
public class BookCatalogServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        PrintWriter out = response.getWriter();
        out.println("<html>" + "<head><title>Duke's Bookstore</title></head>" +
                "<body  bgcolor=\"#ffffff\">" + "<center>" +
                "<hr> <br> &nbsp;" + "<h1>" +
                "<font size=\"+3\" color=\"#CC0066\">Duke's </font> <img src=\"" +
                "./duke.books.gif\" alt=\"Duke holding books\"\">" +
                "<font size=\"+3\" color=\"black\">Bookstore</font>" + "</h1>" +
                "</center>" + "<br> &nbsp; <hr> <br> ");
        try {
            BookDBAO db = new BookDBAO();
            List<BookDetails> list = db.getAllBookDetails();
          //  PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<body>");
            out.println("<table>");
            for (int i = 0; i < list.size(); i++) {
                out.println("<tr>");
                out.println("<td><p>" + list.get(i).getTitle() + "</p><p>" + list.get(i).getFirstName() +
                        list.get(i).getSurname() +"</p></td>");
                out.println("<td>" + list.get(i).getDescription() + "</td>");
                out.println("<td>" + list.get(i).getYear() + "</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException(e);
        }
    }
}

     /*   PrintWriter out = response.getWriter();
        out.println("<html>" + "<head><title>Duke's Bookstore</title></head>" +
                "<body  bgcolor=\"#ffffff\">" + "<center>" +
                "<hr> <br> &nbsp;" + "<h1>" +
                "<font size=\"+3\" color=\"#CC0066\">Duke's </font> <img src=\"" +
                "./duke.books.gif\" alt=\"Duke holding books\"\">" +
                "<font size=\"+3\" color=\"black\">Bookstore</font>" + "</h1>" +
                "</center>" + "<br> &nbsp; <hr> <br> ");


        BookDBAO das = new BookDBAO();
        ArrayList<BookDetails> list = das.getAllBookDetails();

        out.println("<h2> Please choose from our selections </h2>");

        for (int i=0; i<list.size();i++){

            //Print out the information obtained
            out.println("<tr>" + list.get(i).getTitle() +  "</tr>" + "<tr>" +
                    list.get(i).getPrice() + "</tr>" + "<tr> Add to Cart</tr>"
                    + "<td>" + list.get(i).getFirstName() + " " + list.get(i).getSurname() + "</td>"
                  );
        }

        out.println("</body></html>");
    }
}  */