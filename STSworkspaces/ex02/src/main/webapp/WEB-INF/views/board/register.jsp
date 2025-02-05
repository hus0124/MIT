<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>    
<%@include file = "../includes/header.jsp" %> <!-- 상위로 가서 다시 includes 폴더의 header.jsp로 경로 설정한단 뜻 -->

            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Tables</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Board Register
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            
                            <form role = "form" action = "/board/register" method="post">
                            <div class = "form-group">
                            	<label>제목</label><input class = "form-control" name="title"></div>
                            <div class = "form-group"> 	
                             	<label>작성자</label><input class = "form-control" name="writer"></div>
                            <div class = "form-group"> 	
                             	<label>내용</label><textarea class = "form-control" rows="10" name="content"></textarea></div>
                            
                            <button type="submit" class="btn btn-default">글등록하기</button>
                            <button type="reset" class="btn btn-default">리셋하기</button> 	
                             
                            </form>
                      
                        </div>
                        <!-- end panel-body -->
                    </div>
                    <!-- end panel -->
                </div>
            </div>
                 <!-- /.row -->
       

    <%@include file="../includes/footer.jsp" %>
