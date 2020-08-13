<%@ page import="java.util.*,java.text.SimpleDateFormat"%>

<div class="header">
	<label class="lab1">login</label>
	<label class="lab2">
		 <%
	     Date date = new Date();
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		 String formatDate = sdf.format(date);
		 out.print(formatDate);
		 %>
	</label>
</div>
