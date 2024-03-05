<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <link rel="stylesheet" href="/resource/css/reset.css">
  <link rel="stylesheet" href="/css/mdi-style.css">
  <link rel="stylesheet" href="/css/tui-grid.css">
  <link rel="stylesheet" href="/css/tui-pagination.css">
  <link rel="stylesheet" href="/css/sub-style.css">
<title>게시판 만들기</title>
</head>
<body>
  <section class="sub-page">
    <div class="s__container">
      <div class="s__row">
        <div class="rayout02">
          <div class="board01">
            <form>
              <div class="border-search01">
                <select name="keyword">
                  <option value="0">전체</option>
                </select>
                <input type="text" name="searchKeyword" />
                <button class="btn-main">검색</button>
              </div>
            </form>
            <!--해당 div에 리스트를 출력해보기-->
            <div id="grid"></div>
          </div>
        </div>
      </div>
    </div>
  </section>
  <script src="/js/jquery-1.9.1.js"></script>
  <script src="/js/tui-pagination.js"></script>
  <script src="/js/tui-grid.js"></script>
    <script>
    // 도움말
    //https://github.com/nhn/tui.grid/blob/master/packages/toast-ui.grid/docs/ko/README.md 

    // 원래 대로라면 이렇게
    const dataSource = {
        api: {
          readData: { url: '/board/selectBoardList', method: 'GET'}
        }
      };

    //로컬이니까 가라데이터 // DB에서 가라 데이터 작성후 받아와서 리스트 뿌려볼것 

    const grid = new tui.Grid({
      el: document.getElementById("grid"),
      data: dataSource,
      scrollX: true,
      scrollY: false,
      minBodyHeight: 30,
      rowHeaders: [{
        type: 'rowNum',
        header: "번호",
        width: 80,
      }],
      pageOptions: {
        useClient: true,
        perPage: 10,
      },
      header: {
        height: 57
      },
      minRowHeight: 71,
      columns: [
        {
          header: '제목',
          name: 'title',
          align: 'center',
        },
        {
          header: '작성자',
          name: 'data2',
          align: 'center',
          width: 200,
        },
        {
          header: '등록일',
          name: 'data3',
          align: 'center',
          width: 200,
        },
        {
          header: '조회',
          name: 'data5',
          align: 'center',
          width: 200,
        }
      ],
    });
  </script>
</body>
</html>