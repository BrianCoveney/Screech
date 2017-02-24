package main.java.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
    COMP8007 OO Server Side Programming
    Assignment 1
    Student: Brian Coveney
    Date: 24/02/2017
    Rev: 4

    (Ref James O. Harris at: https://drive.google.com/file/d/0B63wvMT2tuKhZWNOa2swMHZsMlU/view)
    The minimum skid speed formula
    S = √30 * D * f * n
    Where -
    S = Speed, in miles per hour.
    30 = A constant value used in this equation.
    D = Skid Distance, in decimal feet and inches.
    f = Drag factor for the road surface.
    n = Braking efficiency as a percent.
 */

@WebServlet("/ScreechServlet")
public class ScreechServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    //30 = A constant value used in this equation.
    private static final int EQUATION_CONST = 30;


    public ScreechServlet() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double skidLength = Integer.parseInt(request.getParameter("skidlength"));
        int skidMark = Integer.parseInt(request.getParameter("skidmark"));
        double dragFactor = 0.75;
        double breakingEfficiency = 1.0;

        // get result from method below
        double result = calculateSpeed(skidLength, dragFactor, breakingEfficiency);

        // create html from method below
        StringBuffer stringBuffer = createHTMLDoc(result);

        PrintWriter printWriter = response.getWriter();
        printWriter.println(stringBuffer);
        printWriter.close();
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String skLength = request.getParameter("skidlength");
        PrintWriter pw = response.getWriter();
        pw.println(skLength);

    }


    // calculate the result, using the formula:   S = √30 * D * f * n
    public double calculateSpeed(double skidDist, double dragFact, double breakingEffy) {
        double product = EQUATION_CONST * skidDist * dragFact;
        double total = Math.sqrt(product);
        double totalRounded = Math.round(total * 10) / 10.0; // to one decimal place
        return totalRounded;
    }


    // create and send HTML to the client
    protected StringBuffer createHTMLDoc(double res) {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("<html><head><title>\n");
        stringBuff.append("Screech GET Result\n");
        stringBuff.append("</title></head><body>\n");
        stringBuff.append("<h3>Base on your figures, the cars speed was:</h3>\n");
        stringBuff.append("<h3>" + res + "mph</h3>");
        stringBuff.append("</body></html>");
        return stringBuff;
    }

}