<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
  <!-- 공통작성 -->
  <script src="../../scripts/atom/ui_common.js"></script>
  <link rel="shortcut icon" type="image/x-icon" href="../../images/atom/favicon.ico">
  <link rel="stylesheet" href="../../styles/atom/style.css">
  <link rel="stylesheet" href="../../styles/thingplug/thingplug.css">
  <script>
    function searchClick() {
      var year = $("#selectYear option:selected").val();
      var quater = $("#selectQuarter option:selected").val();
      var dataFormat = {dates : year + "." + quater};
      $.ajax({
        type: "GET",
        contentType: "application/json",
        data: JSON.stringify(dataFormat),
        url: "/findDate",
        success: function() {
          alert("success");
        },
        error: function() {
          alert("error");
        }
      });

    }

  </script>
</head>

<body>
  <div class="header"></div>
  <div class="wrap">
    <div class="content">
      <ul class="breadcrumb">
        <li>ATOM</li>
        <li>Configuration</li>
        <li class="now">Resource Configuration</li>
      </ul>
      <h2 class="h2">Seoul City Population Statistics</h2>
      <div class="cont_wrap">
        <ul class="tab_menu type_02">
          <li class="active"><!-- Selected tab -->
            <a href="#none"><span class="txt">Seoul City</span></a>
          </li>
        </ul>
        <div class="search_area auto hidden">
          <div class="search_box">
            <table cellpadding="20px">
              <tbody>
                <tr>
                  <th>Package</th>
                  <td>
                    <div class="select type_01 m">
                      <select id="select_temp_id_0">
                        <option value="1">select m</option>
                        <option value="2">option_01</option>
                        <option value="3">option_02</option>
                      </select>
                    </div>
                  </td>
                </tr>
                <tr>
                  <th>Node</th>
                  <td>
                    <div class="select type_01 m">
                      <select id="select_temp_id_1">
                        <option value="1">select m</option>
                        <option value="2">option_01</option>
                        <option value="3">option_02</option>
                      </select>
                    </div>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>
          <div class="btn_box">
            <button type="button" class="btn search">
              Search
            </button>
          </div>
        </div>
        <div class="layout type_01">
          <div class="cell type_01">
            <div class="box">
              <div class="loading hide"><span></span></div>
              <div class="search_message hide">검색하신 내용이 없습니다.<br>Package와 Node를 선택해 주십시오.</div>
              <ul class="side_menu">  
                <c:forEach items="${rowLists}" var="item" varStatus="status">
                  <li <c:if test="${status.index eq 0}">class="active"</c:if>><a href="select?val=${item.JACHIGU}">${item.JACHIGU}</a></li>
                </c:forEach>
              </ul>
            </div>
          </div>
          <div class="cell">
            <div class="box">
              <div class="loading hide"><span></span></div>
              <div class="search_message hide">선택된 내용이 없습니다.<br>왼쪽에서 Resource를 선택해 주십시오.</div>
              <div> 
                <table>
                  <tr>
                    <td>                      
                    <table>
                      <tr>
                        <td rowspan="2" ><div style="width:7px;"></div></td>
                        <td><center><b>연도</b></center></td>
                          <td>
                          <div style="width:7px;"></div>
                          </td>
                        <td><center><b>분기</b></center></td>
                      </tr>
                      <tr>
                    <td>
                      <div class="select type_01 s">
                        <select class="form-control" id="selectYear">
                          <c:forEach begin="2010" end="2020" var = "index">
                            <option value="${index}">${index}</option>
                          </c:forEach>
                        </select>
                      </div>
                    </td>
                    <td>
                    <div style="width:7px;"></div>
                  </td>
                    <td>
                      <div class="select type_01 s">
                        <select class="form-control" id="selectQuarter">
                          <option value="1-4">1-4</option>
                          <option value="2-4">2-4</option>
                          <option value="3-4">3-4</option>
                          <option value="4-4">4-4</option>
                        </select>
                      </div>
                    </td>
                    <td><div style="width:5px;"></div></td>
                    <td>                      
                      <div class="btn_box">
                        <div class="btn_area">
                        <button type="button" class="btn type_01" onclick="searchClick()">Search</button>
                      </div>
                      </div>
                    </td>
                  </tr>
                  </table>
                </td>
                <td>
                <div style="width:40px;"></div>
                </td>
                <td>
                <table border="1" width="700" height="350">
                  <tbody>
                    <div style="margin-top:30px;"></div>
                    <tr>                      
                      <td style="vertical-align: middle;" >
                        <span class="label" ><center><b>세대 수</b></center></span>
                      </td>
                      <td colspan="3">
                        <center>${rowLists[0].SEDAE}</center>
                      </td>
                    </tr>
                    <tr>
                      <td rowspan="9" style="vertical-align: middle;" >
                        <span class="label" ><center><b>인구</b></center></span>
                      </td>
                      <th colspan="3">
                        <span class="label" ><center><b>합계</b></center></span>
                      </th>
                    </tr>
                    <tr>
                      <th><center><b>계</b></center></th>
                      <td><center><b>남자</b></center></td>
                      <td><center><b>여자</b></center></td>
                    </tr>
                    <tr>
                      <td>
                        <center>${rowLists[0].GYE_1}</center>
                      </td>
                      <td>
                        <center>${rowLists[0].NAMJA_1}</center>
                      </td>
                      <td>
                        <center>${rowLists[0].YEOJA_1}</center>
                      </td>
                    </tr>
                    <tr>
                      <th colspan="3">
                        <span class="label"><center><b>한국인</b></center></span>
                      </th>
                    </tr>
                    <tr>
                      <th><center><b>계</b></center></th>
                      <th><center><b>남자</b></center></th>
                      <th><center><b>여자</b></center></th>
                    </tr>
                     <tr>
                      <td>
                        <center>${rowLists[0].GYE_2}</center>
                      </td>
                      <td>
                        <center>${rowLists[0].NAMJA_2}</center>
                      </td>
                      <td>
                        <center>${rowLists[0].YEOJA_2}</center>
                      </td>
                    </tr>
                    <tr>
                      <th colspan="3">
                        <span class="label"><center><b>등록 외국인</b></center></span>
                      </th>
                    </tr>
                    <tr>
                      <th><center><b>계</b></center></th>
                      <th><center><b>남자</b></center></th>
                      <th><center><b>여자</b></center></th>
                    </tr>
                    <tr>
                      <td>
                        <center>${rowLists[0].GYE_3}</center>
                      </td>
                      <td>
                        <center>${rowLists[0].NAMJA_3}</center>
                      </td>
                      <td>
                        <center>${rowLists[0].YEOJA_3}</center>
                      </td>
                    </tr>
                     <tr>
                      <td style="vertical-align: middle;" >
                        <span class="label" ><center><b>세대 당 인구</b></center></span>
                      </td>
                      <td colspan="3">
                        <center>${rowLists[0].SEDAEDANGINGU}</center>
                      </td>
                    </tr>
                    <tr>
                      <td style="vertical-align: middle;" >
                        <span class="label" ><center><b>65세 이상 고령자</b></center></span>
                      </td>
                      <td colspan="3">

                      </td>
                    </tr> 
                  </tbody>
                </table>
              </td>
            </tr>
              </table>

              </div>
            </div>
          </div>
        </div>
      </div>
      <!--//cont_wrap-->
    </div>
  </div>
</body>

</html>