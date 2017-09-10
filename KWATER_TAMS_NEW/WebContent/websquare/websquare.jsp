<%@page contentType="text/html; charset=utf-8" language="java"%>
<%@include file="/jsp/checkLogin.jsp"%>
<!-- 4차 임포트 대상 커밋 테스트 -->
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
<!-- 
commit: 파일 및 디렉토리에 대한 변경 사항을 Git의 인덱스에 기록한다. 
커미트할 변경 사항이 있는 파일 및 디렉토리를 지정할 때 -a 옵션을 사용하여 Git가 추적 중인 파일에 대한 모든 보류 중인 변경 사항을
추가하거나 --interactive 옵션을 사용하여 함께 커미트하려는 파일 또는 디렉토리 변경 사항을 선택할 수 있다. 
(두 번째 방법은 많은 수의 파일이 포함된 여러 다양한 작업을 수행하는 중에 특정 변경 사항을 함께 커미트하려는 경우에 매우 유용하다. 
커미트는 로컬 저장소에 적용되므로 원격 중앙 저장소를 사용하는 경우에는 Git의 push 명령을 사용하여 로컬 변경 사항을 원격 저장소에 
저장해야 한다.)

push: 로컬 인덱스 및 오브젝트 변경 정보를 사용하여 원격 저장소를 업데이트한다. 
 -->