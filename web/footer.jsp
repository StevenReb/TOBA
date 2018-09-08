<!-- Importing required classes for calendar -->
<%@ page import="java.util.GregorianCalendar, java.util.Calendar" %>

        <% 
            // Creating variables to store dates
            GregorianCalendar currentDate = new GregorianCalendar();
            int currentYear = currentDate.get(Calendar.YEAR);
            int currentMonth = currentDate.get(Calendar.MONTH);
            int currentDay = currentDate.get(Calendar.DAY_OF_WEEK);
            
            String month;
            
            // Swtich statement to identify current month as a string
            switch(currentMonth){
                case 1:  month = "January";
                         break;
                case 2:  month = "February";
                         break;
                case 3:  month = "March";
                         break;
                case 4:  month = "April";
                         break;
                case 5:  month = "May";
                         break;
                case 6:  month = "June";
                         break;
                case 7:  month = "July";
                         break;
                case 8:  month = "August";
                         break;
                case 9:  month = "September";
                         break;
                case 10: month = "October";
                         break;
                case 11: month = "November";
                         break;
                case 12: month = "December";
                         break;
                default: month = "Invalid month";
                         break;
            }
                    
        %>
        
        <!-- Displaying copyright and current date -->
        <p style="padding-left: 10px; padding-top: 25px;"> 
        <%= currentYear %>, <%= month %> <%= currentDay %> ---- Steven Rebelo </p>
        
    </body>
</html>