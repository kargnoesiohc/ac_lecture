package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.MemberDTO;
import com.service.CartService;
import com.service.GoodsService;

@Controller
public class GoodsController {
	@Autowired
	GoodsService gService;
	@Autowired
	CartService cService;
	
	@RequestMapping("/goodsList")
	public ModelAndView goodsList(String gCategory) {
		if(gCategory == null) gCategory = "top";
		List<GoodsDTO> list = gService.goodsList(gCategory);
		System.out.println(list);
		ModelAndView mav = new ModelAndView();
		mav.addObject("goodsList", list);
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping("/goodsRetrieve")
	@ModelAttribute("goodsDTO") //key
	public GoodsDTO goodsRetrieve(String gCode) {
		System.out.println(gCode);
		GoodsDTO dto = gService.goodsRetrieve(gCode);
		System.out.println(dto);
		return dto;
	}
	
	@RequestMapping("/loginCheck/cartAdd")
	public String cartAdd(CartDTO dto, HttpSession session, RedirectAttributes rttr) {
		System.out.println(dto);
		MemberDTO mDTO = (MemberDTO) session.getAttribute("login");
		String userid = mDTO.getUserid();
		dto.setUserid(userid);
		System.out.println(dto);
		int n = cService.cartAdd(dto);
		if(n > 0) {
			rttr.addFlashAttribute("mesg", dto.getGName()+"상품이 장바구니에 등록되었습니다.");
		}
		
		return "redirect:../goodsRetrieve?gCode="+dto.getGCode();
	}
}
