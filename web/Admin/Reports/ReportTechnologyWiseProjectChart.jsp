<%@page import="java.sql.ResultSet"%>
<%@page import="Source.DataManager"%>
<!DOCTYPE HTML>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>Reports</title>

        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
        <style type="text/css">
            ${demo.css}
        </style>
        <script type="text/javascript">
            $(function () {
            $('#container').highcharts({
            chart: {
            type: 'pie',
                    options3d: {
                    enabled: true,
                            alpha: 45,
                            beta: 0
                    }
            },
                    title: {
                    text: 'Technology Wise Projects'
                    },
                    tooltip: {
                    pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
                    },
                    plotOptions: {
                    pie: {
                    allowPointSelect: true,
                            cursor: 'pointer',
                            depth: 35,
                            dataLabels: {
                            enabled: true,
                                    format: '{point.name}'
                            }
                    }
                    },
                    series: [{
                    type: 'pie',
                            name: 'Browser share',
                            data: [
            <%
                DataManager dm = new DataManager();
                ResultSet rs = dm.getData("SELECT COUNT(*),    `technology`.`Technology_name`FROM    `technology`    INNER JOIN `project`         ON (`technology`.`Technology_id` = `project`.`Technology_id`) GROUP BY `technology`.`Technology_name`;");
                ResultSet rs1 = dm.getData("SELECT COUNT(*) FROM project");
                int i = 0;
                if (rs1.next()) {
                    while (rs.next()) {
                        double deg = 360 * Double.parseDouble(rs.getString(1)) / Double.parseDouble(rs1.getString(1));
                        if (i == 0) {%>
                            ['<%= rs.getString(2)%>', <%= deg%>]
            <%
                i = 1;
            } else {%>
                            , ['<%= rs.getString(2)%>', <%= deg%>]
            <%}
            %>

            <%}
                }
            %>
                            ]
                    }]
            });
            });
        </script>
    </head>
    <body>

        <script src="js/highcharts.js"></script>
        <script src="js/highcharts-3d.js"></script>
        <script src="js/exporting.js"></script>

        <div id="container" style="height: 400px"></div>
    </body>
</html>
