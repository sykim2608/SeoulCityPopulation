<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>ATOM</title>
  <script src="../../scripts/atom/jquery.1.11.2.min.js"></script>
  <!-- datetime, date, time -->
  <script src="../../scripts/atom/datetimepicker.moment.js"></script>
  <script src="../../scripts/atom/datetimepicker.js"></script>
  <!-- multiselect -->
  <script src="../../scripts/atom/bootstrap-multiselect.js"></script>
  <!-- °øÅëÀÛ¼º -->
  <script src="../../scripts/atom/ui_common.js"></script>
  <link rel="shortcut icon" type="image/x-icon" href="../../images/atom/favicon.ico">
  <link rel="stylesheet" href="../../styles/atom/style.css">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

  <script>
    $(document).ready(function(){
      $(".load_wrap").remove();


    });
  </script>

  <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
    // Load google charts
    google.charts.load('current', {'packages':['corechart']});
    google.charts.setOnLoadCallback(drawChart);

    // Draw the chart and set the chart values
    function drawChart() {
      var data = google.visualization.arrayToDataTable([
      ['Task', 'Hours per Day'],
      ['Work', 8],
      ['Eat', 2],
      ['TV', 4],
      ['Gym', 2],
      ['Sleep', 8]
    ]);

      // Optional; add a title and set the width and height of the chart
      var options = {'title':'My Average Day', 'width':800, 'height':600};

      // Display the chart inside the <div> element with id="piechart"
      var chart = new google.visualization.PieChart(document.getElementById('piechart'));
      chart.draw(data, options);
    }
    </script>

</head>
<body>
  <div class="header"></div>
  <div class="wrap">
    <div class="content">
      <h2 class="h2">Seoul City Population Statistics</h2>
      <div class="cont_wrap">
        <div class="search_area auto">
          <div class="search_box">
            <table>
              <tbody>
                <tr>
                  <th>District</th>
                  <td>
                    <div class="select type_02 m">
                      <select class="form-control">
                        <option>Select District</option>
                        <option value="1">All</option>
                        <option value="2">Creating</option>
                        <option value="3">In Progress</option>
                        <option value="4">Success</option>
                        <option value="5">Fail</option>
                      </select>
                    </div>
                  </td>
                  <th>Year</th>
                  <td>
                    <div class="select type_02 m">
                      <select class="form-control">
                        <option>Select Year</option>
                        <option value="1">2015</option>
                        <option value="2">2016</option>
                        <option value="2">2017</option>
                        <option value="2">2018</option>
                        <option value="2">2019</option>
                        <option value="2">2020</option>
                      </select>
                    </div>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>
          <div class="btn_box">
            <button id="searchBtn"type="button" class="btn search" onclick="searchClick()"> Search </button>
          </div>
        </div>
        <div class="board_top">
<!--           <div class="cell nth_01 total_result" id="total_result">
            Total
          </div> -->
          <div class="cell nth_02 option_box">
            <div class="select type_03 line">
              <select class="form-control" id="selectLine" name="selectLine">
                <option value="10" <c:if test="${pagingModel.pageSize eq '10'}">selected</c:if>>10 Line</option>
                <option value="50" <c:if test="${pagingModel.pageSize eq '50'}">selected</c:if>>50 Line</option>
                <option value="100"<c:if test="${pagingModel.pageSize eq '100'}">selected</c:if>>100 Line</option>
              </select>
            </div>
          </div>
        </div>
        <div id="piechart"></div>
          
        <!-- Loading -->
        <div class="table type_03 y_scroll" id="loading">
          <div class="load_wrap">
            <div class="loading"><span></span></div>
          </div>
        </div>

      </div>
    </div>
  </div>
</body>
</html>