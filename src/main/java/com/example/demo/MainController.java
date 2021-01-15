package com.example.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping("/")
	public ModelAndView index(ModelAndView mv) {
		mv.addObject("name", "鈴木Java五郎");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping("/test")
	public ModelAndView test(ModelAndView mv) {
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping(value="/day", method=RequestMethod.GET)
	public ModelAndView indexGet(ModelAndView mv) {
		mv.addObject("name","名前がここに入ります");
		mv.addObject("age","年齢がここに入ります");
		mv.addObject("height","身長がここに入ります");
		mv.addObject("day","入力してください");
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping(value="/day", method=RequestMethod.POST)
	public ModelAndView indexPost(ModelAndView mv,
	@RequestParam("nameVal")String name,
	@RequestParam("ageVal")String age,
	@RequestParam("heightVal")String height) {
		mv.addObject("name",name);
		mv.addObject("age",age);
		mv.addObject("height",height);
		mv.setViewName("index");
		return mv;
	}
//	day20の課題　階乗の計算をする
	@RequestMapping(value="/day20", method=RequestMethod.GET)
	public ModelAndView	day20Get(ModelAndView mv) {
		mv.addObject("num","階乗の計算をします。");
		mv.setViewName("day20");
		return mv;
	}
	@RequestMapping(value="/day20",method=RequestMethod.POST)
	public ModelAndView day20Post(ModelAndView mv,
	@RequestParam("numVal")int number) {
		int sum=0;
		for(int num=number;num>=0;num--){
			sum+=num;
		}	
		mv.addObject("num",number+"の階乗は"+sum+"です！");
		mv.setViewName("day20");
		return mv;
		}
	
	@RequestMapping(value="/days",method=RequestMethod.GET)
	public ModelAndView index21Get(ModelAndView mv) {
		mv.addObject("suzuki",false);
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping(value="/days",method=RequestMethod.POST)
	public ModelAndView index21Post(ModelAndView mv) {
		mv.addObject("suzuki",true);
		mv.setViewName("index");
		return mv;
	}
//	urlに名前を入力して表示させる
//	@RequestMapping("/{name}")
//	public ModelAndView indexname(@PathVariable String name, ModelAndView mv) {
//		mv.addObject("name",name);
//		mv.setViewName("index");
//		return mv;
//	}

//	urlに入力した整数の数だけ　あを表示させる
//	@RequestMapping("/{num}")
//	public ModelAndView indexnum(@PathVariable int num, ModelAndView mv) {
//		String line="";
//		for(int i=0;i<num; i++) line+="あ";
//		mv.addObject("name",line);
//		mv.setViewName("index");
//		return mv;
//	}
	
//	day21の課題　素数判定マシーン
	@RequestMapping("/{number}")
	public ModelAndView day21(@PathVariable int number, ModelAndView mv) {
		if(number==1) {
			mv.addObject("answer",number+"は素数ではありません...");
		}
		else if(number==2) {
			mv.addObject("answer",number+"は素数です！");
		}
		else {
			for(int a=2;a<number;a++) {
				if(number%a==0) {
					mv.addObject("answer",number+"は素数ではありません...");
					break;
				}
				else {
					mv.addObject("answer",number+"は素数です！");
				}
			}
		}
		mv.setViewName("day21");
		return mv;
	}
	
//	inputタグの課題
	@RequestMapping(value="/input",method=RequestMethod.GET)
	public ModelAndView inputGet(ModelAndView mv) {
		mv.setViewName("inputstudy");
		mv.addObject("hotel","ホテルの予約を取ろう");
		mv.addObject("people","何名様の予約ですか？");
		mv.addObject("room","部屋の種類は？");
		mv.addObject("meal","食事はどうされますか？");
		return mv;
	}
	@RequestMapping(value="/input",method=RequestMethod.POST)
	public ModelAndView inputPost(ModelAndView mv,
	@RequestParam("people")String people,
	@RequestParam("room")String room,
	@RequestParam("meal")String meal) {
		String[]peo={"peopleone","peopletwo","peoplethree"};
		String[]num={"１名様","２名様","３名様"};
		String[]rooms= {"normal","capsule","rich","love","poor"};
		String[]roomname= {"ノーマル","カプセル","リッチ","ラブ","貧しい"};
		String[]meals= {"japan","western","china","korea","no"};
		String[]mealname={"和食","洋食","中華","韓国","食べない"};
		for(int a=0;a<3;a++) {
			if(people.equals(peo[a])) {
				mv.addObject("people",num[a]);
			}
		}
		for(int a=0;a<5;a++) {
			if(room.equals(rooms[a])) {
				mv.addObject("room",roomname[a]);
			}
		}
		for(int a=0;a<5;a++) {
			if(meal.equals(meals[a])) {
				mv.addObject("meal",mealname[a]);
			}
		}
		mv.addObject("hotel","予約の確認です");
		mv.setViewName("inputstudy");
		return mv;
	 }
	@RequestMapping(value="/day22")
	public ModelAndView day22Post(ModelAndView mv){
		ArrayList<String[]>customers = new ArrayList<String[]>();
		customers.add(new String[]{"佐藤HTML太郎","35歳","男性","群馬"});
		customers.add(new String[]{"鈴木Java五郎","24歳","男性","新潟"});
		customers.add(new String[]{"高橋CSS子","29歳","女性","石川"});
		customers.add(new String[]{"お肉太郎","29歳","トランスジェンダー","岐阜"});
		customers.add(new String[]{"焼肉さん","31歳","トランスジェンダー","神奈川"});
		mv.addObject("customers",customers);
		mv.setViewName("day22");
		return mv;
	}
	@RequestMapping(value="/day23")
	public ModelAndView day23Post(ModelAndView mv) {
//		ArrayList<String[]>foods = new ArrayList<String[]>();
		ArrayList<int[]>numbers=new ArrayList<int[]>();
		numbers.add(new int[] {1,2,3,4,5,6,7});
		numbers.add(new int[] {1,2,3,4,5,6,7});
		numbers.add(new int[] {1,2,3,4,5,6,7});
//		foods.add(new String[]{"りんご","洋梨","みかん"});
//		foods.add(new String[]{"マンゴー","マンゴスチン","チェリモヤ"});
//		foods.add(new String[]{"ぶどう","ぶどう","なし"});
//		mv.addObject("foods",foods);
		mv.addObject("numbers",numbers);
		mv.setViewName("day23");
		return mv;
	}
	@RequestMapping("/copy")
	public ModelAndView copy(ModelAndView mv) {
		mv.setViewName("copy");
		return mv;
	}
}


