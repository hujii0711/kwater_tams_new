<%@page contentType="text/html; charset=utf-8" language="java"%>
<%@include file="/cm/jsp/checkLogin.jsp"%>
<!-- 2차 임포트 대상 커밋 테스트 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns='http://www.w3.org/1999/xhtml' xmlns:ev='http://www.w3.org/2001/xml-events' xmlns:w2='http://www.inswave.com/websquare' xmlns:xf='http://www.w3.org/2002/xforms'>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=Edge" />
		<title>	WebSquare </title>
		<script type="text/javascript" src="javascript.wq?q=/bootloader"></script>
		<script type="text/javascript">
			window.onload = init;

			function init() {
				try{
					WebSquare.startApplication();
				} catch(e) {
					alert(e.message);
				}
			}
		</script>
	</head>
<body></body>
</html>