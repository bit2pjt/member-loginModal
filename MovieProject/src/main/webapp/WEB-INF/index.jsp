<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!--
	/**
	* @Class Name : index.jsp
	* @Description : 헤더 수정 및 모달 연습
	* @Modification Information
	* @
	* @  수정일      수정자              수정내용
	* @ ---------   ---------   -------------------------------
	* @ 2019.07.02   박현민       최초생성
	* @ 2019.07.04   박현민       헤더 푸터 수정
	* @ 2019.07.16   박현민       헤더 푸터 링크 수정
	* @ 2019.07.18   박현민	헤더 푸터 파일 나눔
	* @author bit 2조
	* @since 2019. 07.01
	* @version 1.0
	* @see
	*
	*  Copyright (C) by Bit All right reserved.
	*/
	-->
<!-- 1. header1.jsp : head  -->
<%@ include file="./header1.jsp"%>

<!-- 2. 여기에 페이지별 css 추가해주세요 -->

<!-- yj : css 추가 -->
<link rel="stylesheet"
	href="<c:url value="/resources/css/modifyplugins.css" />">
<link rel="stylesheet"
	href="<c:url value="/resources/css/yj_style.css" />">
<!-- 3. heaer2.jsp : header -->
<%@ include file="./header2.jsp" %>

<!-- 4. 페이지별 본문 -->
<div class="slider movie-items">
	<div class="container">
		<div class="row">
			<!-- yj : start | moviechart slider-->
			<div class="movie-tabs">
				<div class="tabs">
					<ul id="moviechart-ul" class="tab-links tabs-mv">
						<li style="display:none;"><a href="#total">통합</a></li>
						<li class="active"><a href="#cgv"> CGV </a></li>
						<li><a href="#naver"> 네이버  </a></li>
						<li><a href="#daum"> 다음  </a></li>
					</ul>
					<div class="moviechart">
						<!-- yj : start | total tab-->
						<!-- yj : start | cgv tab-->
						<div id="cgv" class="tab active">
							<div class="slick-multiItemSlider">
							<c:forEach items="${cgvList }" var="cgvChart" varStatus="status">
								<div class="movie-item">
									<div class="mv-img">
										<a href="#"><img
											src="${cgvChart.thumnail}" alt="" width="285"
											height="437"></a>
									</div>
									<div class="title-in">
										<h6>
											<a href="#">${cgvChart.movieTitle}</a>
										</h6>
										<p>
											<i class="ion-android-star"></i>예매율<span>${cgvChart.score}</span>
										</p>
									</div>
									<div class="movie-ranking">${status.count }</div>
								</div>
							</c:forEach>
							<!--  
								<div class="movie-item">
									<div class="mv-img">
										<a href="#"><img
											src="resources/images/uploads/slider1.jpg" alt="" width="285"
											height="437"></a>
									</div>
									<div class="title-in">
										<h6>
											<a href="#">movie title</a>
										</h6>
										<p>
											<i class="ion-android-star"></i>평점<span>0</span> /10
										</p>
										<p>
											<i class="ion-android-star"></i>예매율<span>00%</span>
										</p>
									</div>
									<div class="movie-ranking">2</div>
								</div>
								<div class="movie-item">
									<div class="mv-img">
										<a href="#"><img
											src="resources/images/uploads/slider1.jpg" alt="" width="285"
											height="437"></a>
									</div>
									<div class="title-in">
										<h6>
											<a href="#">movie title</a>
										</h6>
										<p>
											<i class="ion-android-star"></i>평점<span>0</span> /10
										</p>
										<p>
											<i class="ion-android-star"></i>예매율<span>00%</span>
										</p>
									</div>
									<div class="movie-ranking">3</div>
								</div>
								<div class="movie-item">
									<div class="mv-img">
										<a href="#"><img
											src="resources/images/uploads/slider1.jpg" alt="" width="285"
											height="437"></a>
									</div>
									<div class="title-in">
										<h6>
											<a href="#">movie title</a>
										</h6>
										<p>
											<i class="ion-android-star"></i>평점<span>0</span> /10
										</p>
										<p>
											<i class="ion-android-star"></i>예매율<span>00%</span>
										</p>
									</div>
									<div class="movie-ranking">4</div>
								</div>
								<div class="movie-item">
									<div class="mv-img">
										<a href="#"><img
											src="resources/images/uploads/slider1.jpg" alt="" width="285"
											height="437"></a>
									</div>
									<div class="title-in">
										<h6>
											<a href="#">movie title</a>
										</h6>
										<p>
											<i class="ion-android-star"></i>평점<span>0</span> /10
										</p>
										<p>
											<i class="ion-android-star"></i>예매율<span>00%</span>
										</p>
									</div>
									<div class="movie-ranking">5</div>
								</div>
								<div class="movie-item">
									<div class="mv-img">
										<a href="#"><img
											src="resources/images/uploads/slider1.jpg" alt="" width="285"
											height="437"></a>
									</div>
									<div class="title-in">
										<h6>
											<a href="#">movie title</a>
										</h6>
										<p>
											<i class="ion-android-star"></i>평점<span>0</span> /10
										</p>
										<p>
											<i class="ion-android-star"></i>예매율<span>00%</span>
										</p>
									</div>
									<div class="movie-ranking">6</div>
								</div>
								<div class="movie-item">
									<div class="mv-img">
										<a href="#"><img
											src="resources/images/uploads/slider1.jpg" alt="" width="285"
											height="437"></a>
									</div>
									<div class="title-in">
										<h6>
											<a href="#">movie title</a>
										</h6>
										<p>
											<i class="ion-android-star"></i>평점<span>0</span> /10
										</p>
										<p>
											<i class="ion-android-star"></i>예매율<span>00%</span>
										</p>
									</div>
									<div class="movie-ranking">7</div>
								</div>
								<div class="movie-item">
									<div class="mv-img">
										<a href="#"><img
											src="resources/images/uploads/slider1.jpg" alt="" width="285"
											height="437"></a>
									</div>
									<div class="title-in">
										<h6>
											<a href="#">movie title</a>
										</h6>
										<p>
											<i class="ion-android-star"></i>평점<span>0</span> /10
										</p>
										<p>
											<i class="ion-android-star"></i>예매율<span>00%</span>
										</p>
									</div>
									<div class="movie-ranking">8</div>
								</div>
								-->
							</div>
						</div>
						<!-- yj : start | lottecinema tab-->
						<div id="naver" class="tab">
							<div class="slick-multiItemSlider">
							<c:forEach items="${naverList }" var="naverChart" varStatus="status">
								<div class="movie-item">
									<div class="mv-img">
										<a href="#"><img
											src="${naverChart.thumnail}" alt="" width="285"
											height="437"></a>
									</div>
									<div class="title-in">
										<h6>
											<a href="#">${naverChart.movieTitle}</a>
										</h6>
										<p>
											<i class="ion-android-star"></i>평점<span>${naverChart.star}</span> /10
										</p>
										<p>
											<i class="ion-android-star"></i>예매율<span>${naverChart.score}</span>
										</p>
									</div>
									<div class="movie-ranking">${status.count }</div>
								</div>
							</c:forEach>
							<!--  
								<div class="movie-item">
									<div class="mv-img">
										<a href="#"><img
											src="resources/images/uploads/slider1.jpg" alt="" width="285"
											height="437"></a>
									</div>
									<div class="title-in">
										<h6>
											<a href="#">movie title</a>
										</h6>
										<p>
											<i class="ion-android-star"></i>평점<span>0</span> /10
										</p>
										<p>
											<i class="ion-android-star"></i>예매율<span>00%</span>
										</p>
									</div>
									<div class="movie-ranking">2</div>
								</div>
								<div class="movie-item">
									<div class="mv-img">
										<a href="#"><img
											src="resources/images/uploads/slider1.jpg" alt="" width="285"
											height="437"></a>
									</div>
									<div class="title-in">
										<h6>
											<a href="#">movie title</a>
										</h6>
										<p>
											<i class="ion-android-star"></i>평점<span>0</span> /10
										</p>
										<p>
											<i class="ion-android-star"></i>예매율<span>00%</span>
										</p>
									</div>
									<div class="movie-ranking">3</div>
								</div>
								<div class="movie-item">
									<div class="mv-img">
										<a href="#"><img
											src="resources/images/uploads/slider1.jpg" alt="" width="285"
											height="437"></a>
									</div>
									<div class="title-in">
										<h6>
											<a href="#">movie title</a>
										</h6>
										<p>
											<i class="ion-android-star"></i>평점<span>0</span> /10
										</p>
										<p>
											<i class="ion-android-star"></i>예매율<span>00%</span>
										</p>
									</div>
									<div class="movie-ranking">4</div>
								</div>
								<div class="movie-item">
									<div class="mv-img">
										<a href="#"><img
											src="resources/images/uploads/slider1.jpg" alt="" width="285"
											height="437"></a>
									</div>
									<div class="title-in">
										<h6>
											<a href="#">movie title</a>
										</h6>
										<p>
											<i class="ion-android-star"></i>평점<span>0</span> /10
										</p>
										<p>
											<i class="ion-android-star"></i>예매율<span>00%</span>
										</p>
									</div>
									<div class="movie-ranking">5</div>
								</div>
								<div class="movie-item">
									<div class="mv-img">
										<a href="#"><img
											src="resources/images/uploads/slider1.jpg" alt="" width="285"
											height="437"></a>
									</div>
									<div class="title-in">
										<h6>
											<a href="#">movie title</a>
										</h6>
										<p>
											<i class="ion-android-star"></i>평점<span>0</span> /10
										</p>
										<p>
											<i class="ion-android-star"></i>예매율<span>00%</span>
										</p>
									</div>
									<div class="movie-ranking">6</div>
								</div>
								<div class="movie-item">
									<div class="mv-img">
										<a href="#"><img
											src="resources/images/uploads/slider1.jpg" alt="" width="285"
											height="437"></a>
									</div>
									<div class="title-in">
										<h6>
											<a href="#">movie title</a>
										</h6>
										<p>
											<i class="ion-android-star"></i>평점<span>0</span> /10
										</p>
										<p>
											<i class="ion-android-star"></i>예매율<span>00%</span>
										</p>
									</div>
									<div class="movie-ranking">7</div>
								</div>
								<div class="movie-item">
									<div class="mv-img">
										<a href="#"><img
											src="resources/images/uploads/slider1.jpg" alt="" width="285"
											height="437"></a>
									</div>
									<div class="title-in">
										<h6>
											<a href="#">movie title</a>
										</h6>
										<p>
											<i class="ion-android-star"></i>평점<span>0</span> /10
										</p>
										<p>
											<i class="ion-android-star"></i>예매율<span>00%</span>
										</p>
									</div>
									<div class="movie-ranking">8</div>
								</div>
								-->
							</div>
						</div>
						<!-- yj : start | megabox tab-->
						<div id="daum" class="tab">
							<div class="slick-multiItemSlider">
								<c:forEach items="${daumList }" var="daumChart" varStatus="status">
								<div class="movie-item">
									<div class="mv-img">
										<a href="#"><img
											src="${daumChart.thumnail}" alt="" width="285"
											height="437"></a>
									</div>
									<div class="title-in">
										<h6>
											<a href="#">${daumChart.movieTitle}</a>
										</h6>
										<p>
											<i class="ion-android-star"></i>평점<span>${daumChart.star}</span> /10
										</p>
									</div>
									<div class="movie-ranking">${status.count }</div>
								</div>
							</c:forEach>
							<!--  
								<div class="movie-item">
									<div class="mv-img">
										<a href="#"><img
											src="resources/images/uploads/slider1.jpg" alt="" width="285"
											height="437"></a>
									</div>
									<div class="title-in">
										<h6>
											<a href="#">movie title</a>
										</h6>
										<p>
											<i class="ion-android-star"></i>평점<span>0</span> /10
										</p>
										<p>
											<i class="ion-android-star"></i>예매율<span>00%</span>
										</p>
									</div>
									<div class="movie-ranking">2</div>
								</div>
								<div class="movie-item">
									<div class="mv-img">
										<a href="#"><img
											src="resources/images/uploads/slider1.jpg" alt="" width="285"
											height="437"></a>
									</div>
									<div class="title-in">
										<h6>
											<a href="#">movie title</a>
										</h6>
										<p>
											<i class="ion-android-star"></i>평점<span>0</span> /10
										</p>
										<p>
											<i class="ion-android-star"></i>예매율<span>00%</span>
										</p>
									</div>
									<div class="movie-ranking">3</div>
								</div>
								<div class="movie-item">
									<div class="mv-img">
										<a href="#"><img
											src="resources/images/uploads/slider1.jpg" alt="" width="285"
											height="437"></a>
									</div>
									<div class="title-in">
										<h6>
											<a href="#">movie title</a>
										</h6>
										<p>
											<i class="ion-android-star"></i>평점<span>0</span> /10
										</p>
										<p>
											<i class="ion-android-star"></i>예매율<span>00%</span>
										</p>
									</div>
									<div class="movie-ranking">4</div>
								</div>
								<div class="movie-item">
									<div class="mv-img">
										<a href="#"><img
											src="resources/images/uploads/slider1.jpg" alt="" width="285"
											height="437"></a>
									</div>
									<div class="title-in">
										<h6>
											<a href="#">movie title</a>
										</h6>
										<p>
											<i class="ion-android-star"></i>평점<span>0</span> /10
										</p>
										<p>
											<i class="ion-android-star"></i>예매율<span>00%</span>
										</p>
									</div>
									<div class="movie-ranking">5</div>
								</div>
								<div class="movie-item">
									<div class="mv-img">
										<a href="#"><img
											src="resources/images/uploads/slider1.jpg" alt="" width="285"
											height="437"></a>
									</div>
									<div class="title-in">
										<h6>
											<a href="#">movie title</a>
										</h6>
										<p>
											<i class="ion-android-star"></i>평점<span>0</span> /10
										</p>
										<p>
											<i class="ion-android-star"></i>예매율<span>00%</span>
										</p>
									</div>
									<div class="movie-ranking">6</div>
								</div>
								<div class="movie-item">
									<div class="mv-img">
										<a href="#"><img
											src="resources/images/uploads/slider1.jpg" alt="" width="285"
											height="437"></a>
									</div>
									<div class="title-in">
										<h6>
											<a href="#">movie title</a>
										</h6>
										<p>
											<i class="ion-android-star"></i>평점<span>0</span> /10
										</p>
										<p>
											<i class="ion-android-star"></i>예매율<span>00%</span>
										</p>
									</div>
									<div class="movie-ranking">7</div>
								</div>
								<div class="movie-item">
									<div class="mv-img">
										<a href="#"><img
											src="resources/images/uploads/slider1.jpg" alt="" width="285"
											height="437"></a>
									</div>
									<div class="title-in">
										<h6>
											<a href="#">movie title</a>
										</h6>
										<p>
											<i class="ion-android-star"></i>평점<span>0</span> /10
										</p>
										<p>
											<i class="ion-android-star"></i>예매율<span>00%</span>
										</p>
									</div>
									<div class="movie-ranking">8</div>
								</div>
								-->
							</div>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>
</div>

<!-- yj : end | moviechart slider-->



<!-- 5. footer1.jsp : footer -->

<!-- 6. 페이지별 script 추가 -->

<!-- footer2.jsp : script -->
<%@ include file="./footer2.jsp"%>