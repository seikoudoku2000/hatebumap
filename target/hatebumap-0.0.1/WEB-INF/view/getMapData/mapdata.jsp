{
	"status" : "SUCCESS",
	"list" : [
		<c:forEach var="data" items="${dataList}" varStatus="status">
			{
			"spotName" : "${data.spotName}",
			"title" : "${data.hatebuTitle}",
			"url" : "${data.hatebuUrl}",
			"num" : ${data.hatebuNum},
			"lat" : ${data.lat},
			"lon" : ${data.lon},
			"x11" : ${data.x11},
			"y11" :  ${data.y11},
			"x12" : ${data.x12},
			"y12" :  ${data.y12},
			"x13" :  ${data.x13},
			"y13" :  ${data.y13},
			"x14" :  ${data.x14},
			"y14" :  ${data.y14}
			}<c:if test="${!status.last}">,</c:if>
		</c:forEach>
	]
}