
package com.spring.etc;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class eventController {

	@RequestMapping(value = "/eventCollection", method = RequestMethod.GET)
	public ModelAndView eventCollection(ModelAndView model) {

		String url = "http://www.cgv.co.kr/culture-event/event/end-list.aspx";
		System.out.println("url" + url);
		Document doc = null;

		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Elements element = doc.select("div.sect-evt-entlist");
		element.select("li").attr("class","lists__item js-load");
		
		Elements movie_list = doc.select("div.sect-evt-entlist").select("li").select("a");
		System.out.println("movie_list:"+movie_list);
		// 어레이리스트에 href 수정해서 넣어주기
		ArrayList<Element> movie_list_link = new ArrayList<Element>();		
		for(Element movie_list_link2 : movie_list) {
			movie_list_link.add(movie_list_link2);
			String a = movie_list_link2.attr("href");
			Element b = movie_list_link2.attr("href","http://www.cgv.co.kr"+a);
			
		}
		ArrayList<Element> list = new ArrayList<Element>();

		for (Element element2 : element.select("li")) {
			list.add(element2);
		}
		// 원하는 배열 인덱스를 넣고 싶으면
//		if(list.size() !=0) {
//			System.out.println("===================");
//			System.out.println(list.get(0));
//			model.addObject("img", list.get(1));
//			System.out.println("====================");
//		}
		
		// 이벤트 두번째 더보기 목록
		String url2 = "http://www.cgv.co.kr/culture-event/event/end-list.aspx?page=2";
		System.out.println("url:"+url);
		//Document doc = null;
		
		try {
			doc = Jsoup.connect(url2).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Elements element3 = doc.select("div.sect-evt-entlist");
		element3.select("li").attr("class", "lists__item js-load");
		
		
		
		ArrayList<Element> list2 = new ArrayList<Element>();
		for(Element element4 : element3.select("li")) {
			list2.add(element4);
		}
		
		
		
		
		// CGV 전체 목록
		//-----------------------------------------
		String cgv_total_url = "http://www.cgv.co.kr/culture-event/event/winner/list.aspx";
		System.out.println("cgv_total_url:"+cgv_total_url);
		
		try {
			doc = Jsoup.connect(cgv_total_url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//-----------------------------------------
		// cgv 전체에 넣을 표 목록들
		Elements element5 = doc.select("tbody");
		System.out.println("tbody:"+element5);
		
		
		/////////////////////////////////////////////////////
		// 어레이 리스트 해서 한거
		// href 속성만 가져오기
		Elements href_a = doc.select("tbody").select("tr").select("td").select("a");
		System.out.println("href_a:"+href_a);
		
		String href = doc.select("tbody").select("tr").select("td").select("a").attr("href");
		System.out.println("href:"+href);

		// 어레이리스트에 href_a 태그들을 담고 그거에 속성을 넣어준다.
		ArrayList<Element> href_a_link = new ArrayList<Element>();
		for(Element href_a_link2 : href_a) {
			href_a_link.add(href_a_link2);
			String a = href_a_link2.attr("href");
			Element b = href_a_link2.attr("href","http://www.cgv.co.kr"+a);
			System.out.println("a:"+a);
			System.out.println("b:"+b);
		}
		Elements element6 = doc.select("tbody").select("tr");
		//////////////////////////////////////////////
		System.out.println("cgv 전체 tr태그:"+element6);
		//-----------------------------------------
		
		// CGV 전체 목록 2번째
		String cgv_total_url2 = "http://www.cgv.co.kr/culture-event/event/winner/list.aspx?page=2";
		System.out.println("cgv_total_url2:"+cgv_total_url2); // 두번째 url
		
		try {
			doc = Jsoup.connect(cgv_total_url2).get();
		} catch (IOException e) {
			e.printStackTrace();
		} // 두번째 url 연결
		
		Elements element7 = doc.select("tbody");
		System.out.println("tbody:"+element7);
		// href 속성 가져오기 (두번째링크)
		Elements href_c = doc.select("tbody").select("tr").select("td").select("a");
		System.out.println("href_c:"+href_c);
		
		String href_c_attr = doc.select("tbody").select("tr").select("td").select("a").attr("href");
		System.out.println("hfer_c_attr:"+href_c_attr);
		// 어레이리슽트 href_a 태그들을 담는다
		ArrayList<Element> href_c_link = new ArrayList<Element>();
		for(Element href_c_link2 : href_c) {
			href_c_link.add(href_c_link2);
			String c = href_c_link2.attr("href");
			Element d = href_c_link2.attr("href","http://www.cgv.co.kr"+c);
		}
		
		Elements element8 = doc.select("tbody").select("tr");
		System.out.println("cgv 전체 tr태그:"+element8);
		
		//-----------------------------------------
		// CGV 3사 이벤트
		
		String movie_3_url = "http://www.cgv.co.kr/culture-event/event/end-list.aspx?page=3";
		System.out.println("movie_3_url:"+movie_3_url ); // 이벤트 3사이벤트 url
		
		try {
			doc = Jsoup.connect(movie_3_url).get();
		} catch (IOException e) {
			e.printStackTrace();
		} // 3사 이벤트 url 연결
		
		
		//3사 이벤트에 넣을 li 태글들 
		
		
		//3사 이벤트 href 속성 부여하기
		Elements movie_3_a = doc.select("div.sect-evt-entlist").select("li").select("a");
		
		String movie_3_href = doc.select("div.sect-evt-entlist").select("li").select("a").attr("href");
		// 어레이리스트 href_a 태그들을 담고 그거에 속성을 넣어준다.
		ArrayList<Element> movie_3_link = new ArrayList<Element>();
		for(Element movie_3_link2 : movie_3_a ) {
			movie_3_link.add(movie_3_link2);
			String a = movie_3_link2.attr("href");
			Element b = movie_3_link2.attr("href", "http://www.cgv.co.kr"+a);
		}
		
		Elements movie_3 = doc.select("div.sect-evt-entlist");
		movie_3.select("li").attr("class", "lists__item js-load2");
		System.out.println("movie_3:"+movie_3);
		
		ArrayList<Element> movie_3_list = new ArrayList<Element>();
		for(Element movie_3_2 : movie_3.select("li")) {
			movie_3_list.add(movie_3_2);
		}
		
		
		System.out.println("3사 뮤비 tobdy:"+movie_3);
		

		// CGV 시사회
		
		// cgv시사회 링크
		String premiere = "http://www.cgv.co.kr/culture-event/event/preview/?menu=7";
		System.out.println("premiere:"+premiere); // 시사회 링크주소
		
		try {
			doc = Jsoup.connect(premiere).get();
		} catch (IOException e) {
			e.printStackTrace();
		} // CGV 시사회 url 연결
		
		Elements premiere_tbody = doc.select("tbody");
		System.out.println("premiere_tbody:"+premiere_tbody);// 시사회 tbody객체 전부
		
		Elements premiere_href = doc.select("tbody").select("tr").select("td").select("a");
		System.out.println("premiere_href:"+premiere_href);
		
		String premiere_href_attr = doc.select("tbody").select("tr").select("td").select("a").attr("href");
		System.out.println("premiere_href_attr:"+premiere_href_attr);
		
		// 어레이리스트에 href_ 태그들 담기
		ArrayList<Element> premiere_href_link = new ArrayList<Element>();
		for(Element premiere_href_link2 : premiere_href ) {
			premiere_href_link.add(premiere_href_link2);
			String a = premiere_href_link2.attr("href");
			Element b = premiere_href_link2.attr("href", "http://www.cgv.co.kr"+a);
		}
		Elements premiere_tbody_tr = doc.select("tbody").select("tr");
		
		System.out.println("premiere_tbody_tr:" + premiere_tbody_tr); //시사회 tr 
		
		
		// cgv 제휴 클롤링
		
		String cgv_alliance_url = "http://www.cgv.co.kr/culture-event/event/end-list.aspx?page=4"; // 제휴 크롤링 url
		
		System.out.println("cgv_alliance_url:"+cgv_alliance_url); // url 주소 확인
		
		// cgv 제휴 클롤링url 연동
		try {
			doc = Jsoup.connect(cgv_alliance_url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// cgv 제휴 크롤릴 url li
		Elements cgv_alliance = doc.select("div.sect-evt-entlist");
		cgv_alliance.select("li").attr("class", "lists__item js-load3");
		System.out.println("cgv_alliance:"+cgv_alliance); // doc 객체들 불러오는것 확인
		
		// 제휴 클로링 href = 링크걸어주기
		// a 태그들 불러오기
		
		Elements alliance_a = doc.select("div.sect-evt-entlist").select("li").select("a");
		
		String alliance_href = doc.select("div.sect-evt-entlist").select("li").select("a").attr("href");
		
		// 어레이리스트에 a 태그들 담고 링크 속성 넣어주기
		ArrayList<Element> alliance_link = new ArrayList<Element>();
		for(Element alliance_link2 : alliance_a ) {
			alliance_link.add(alliance_link2);
			String a = alliance_link2.attr("href");
			Element b = alliance_link2.attr("href", "http://www.cgv.co.kr"+a);
		}
		
		
		// arrayList 객체생성호 타입을 element
		ArrayList<Element> cgv_alliance_list = new ArrayList<Element>();
		for(Element cgv_alliance_2 : cgv_alliance.select("li")) {
			cgv_alliance_list.add(cgv_alliance_2);
		}// arraylist 에 li 만 넣어주기
		
		// cgv 제휴 클롤링 2 
		
		String cgv_alliance_url2 = "http://www.cgv.co.kr/culture-event/event/end-list.aspx?page=5"; // 제휴 크롤링 url2
		
		try {
			doc = Jsoup.connect(cgv_alliance_url2).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Elements cgv_alliance2 = doc.select("div.sect-evt-entlist"); 
		cgv_alliance2.select("li").attr("class", "lists__item js-load3");
		System.out.println("cgv_alliance2:"+cgv_alliance2); // 테스트용
		
		Elements alliance2_a = doc.select("div.sect-evt-entlist").select("li").select("a");
		
		String alliance2_href = doc.select("div.sect-evt-entlist").select("li").select("a").attr("href");
		// 어레이리스트 a태그 담고 속성 넣어주기
		
		ArrayList<Element> alliance2_link = new ArrayList<Element>();
		for(Element alliance2_link2 : alliance2_a ) {
			alliance2_link.add(alliance2_link2);
			String a = alliance2_link2.attr("href");
			Element b = alliance2_link2.attr("href", "http://www.cgv.co.kr"+a);
		}
		
		
		// arraylist객체 생성호
		ArrayList<Element> cgv_alliance_list2 = new ArrayList<Element>();
		for(Element cgv_alliance2_2 : cgv_alliance2.select("li")) {
			cgv_alliance_list2.add(cgv_alliance2_2);
		}
		
		
		/*
		 * Elements element3 = doc.select("div.sect-evt-entlist");
		 * element3.select("li").attr("class", "lists__item js-load");
		 * ArrayList<Element> list2 = new ArrayList<Element>(); 
		 * for(Element element4 : element3.select("li")){ 
		 * list2.add(element4); 
		 * }
		 */
		
		// ---------------모델엔드뷰 부분 ------------------------------
		
		model.addObject("img", list);  // 이벤트 전체 첫목록
		model.addObject("img2", list2); // 이벤트 전체 두번째목록
		
		// 3사 이벤트
		model.addObject("movie_3",movie_3_list); // 3사이벤트  li태그
		
		model.addObject("total_td",element6);
		model.addObject("total_td2",element8);
		// 시사회 무대 이벤트
		model.addObject("premiere_tbody_tr", premiere_tbody_tr);
		
		// cgv 제휴
		model.addObject("cgv_alliance_list",cgv_alliance_list);
		model.addObject("cgv_alliance_list2",cgv_alliance_list2);
		
		model.setViewName("event/eventCollection");

		return model;
	}

	

	// 지난이벤트 페이지 매핑
	@RequestMapping(value = "lastevent", method = RequestMethod.GET)
	public ModelAndView lastevent(ModelAndView model) {

		// 페이지를 반복해서 여러가지를 가져오고싶다.
		// for 문해서 마지막에 링크 추가

		String url = "http://www.cgv.co.kr/culture-event/event/end-list.aspx?page=" + 1;
		System.out.println("url" + url);

		Document doc = null;

		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Elements element = doc.select("div.sect-evt-entlist");

		ArrayList<Element> list = new ArrayList<Element>();

		for (Element element2 : element.select("li")) {
			list.add(element2);
		}

		// 원하는 배열 인덱스를 넣고 싶으면
//		if(list.size() !=0) {
//			System.out.println("===================");
//			System.out.println(list.get(0));
//			model.addObject("img", list.get(1));
//			System.out.println("====================");
//		}

		// 2번째 페이지 크롤링
		String cgv_url2 = "http://www.cgv.co.kr/culture-event/event/end-list.aspx?page=2";
		System.out.println("cgv_url2:" + cgv_url2);
		Document doc2= null;
		try {
			doc2 = Jsoup.connect(cgv_url2).get();
			// cgv 2페이지 에 있는 html 태그 모두 가져옴
		} catch (IOException e) {
			e.printStackTrace();
		}

		Elements page2 = doc2.select("div.sect-evt-entlist");

		ArrayList<Element> list2 = new ArrayList<Element>();

		for (Element page2_2 : page2.select("li")) {
			list2.add(page2_2);
		}


		

		// url for문 종료
		model.addObject("img", list);
		System.out.println("img:" + list);
		model.addObject("img2", list2);
		System.out.println("img2:" + list2);
		
		model.setViewName("event/lastevent");

		return model;
	}

	// 당첨자확인
	@RequestMapping(value = "winner", method = RequestMethod.GET)
	public ModelAndView winner(ModelAndView model) {

		// 표단위로 클롤링한다 .. 텍스트를 가지고와야됨
		// cgv url
		String cgv_url = "http://www.cgv.co.kr/culture-event/event/winner/list.aspx";
		System.out.println("cgv_url:" + cgv_url);
		Document doc = null;
		try {
			doc = Jsoup.connect(cgv_url).get();
			// lotte_url 에 있는 html 태그 모두 가져옴
		} catch (IOException e) {
			e.printStackTrace();
		}

		Elements element = doc.select("tbody");
		String text_td = element.select("td").text();

		System.out.println("element:" + element);
		System.out.println("========================");
		System.out.println("text_td:" + text_td);
		// 어레이리스트에 넣어서. 순서대로 넣자

		ArrayList<Element> list_td = new ArrayList<Element>();
		for (Element element2 : element.select("td")) {
			list_td.add(element2);
		}
		// td 3개를 나누어서 넣어준다.
		
		// 반복문으로 <td>태그의 텍스트를 가지고온다.
		if (list_td.size() != 0) {
			System.out.println("===22====================================");
			for(int i=0; i<list_td.size(); i++) {
				System.out.println(list_td.get(i).text());
				model.addObject("td_"+i+"", list_td.get(i).text());
			}
			System.out.println("list(3):"+list_td.get(3));
			System.out.println("====22===================================");
		}
		
		// 당첨자확인 cgv2페
		String cgv_url2 = "http://www.cgv.co.kr/culture-event/event/winner/list.aspx?page=2";
		System.out.println("cgv_url2:"+cgv_url2);
		//Document doc = null;
		try {
			doc = Jsoup.connect(cgv_url2).get();
		}catch (IOException e) {
			e.printStackTrace();
		}
		Elements element2 = doc.select("tbody");
		
		String text_td2 = element.select("td").text();
		
		/*
		 * Elements tbody_attr = element.select("tbody").attr("class", "lists1");
		 * Elements tbody_attr2 = element2.select("tbody").attr("class", "lists1");
		 * element.select("tbody").select("tr").attr("class","lists__item js-load");
		 * element2.select("tbody").select("tr").attr("class","lists__item js-load");
		 */
		 
		System.out.println("element2:"+element2);
		System.out.println("=================");
		System.out.println("text_td2:"+text_td2);
		// 어레이 리스트에 새롭게 넣자 
		
		
		
		
		model.addObject("element", element);
		//2번재 표
		model.addObject("element2",element2);
		
		model.setViewName("event/winner");
		return model;
	}
	
	

	

}
