package cn.cciab.serverDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cn.cciab.serverDemo.entity.News;

@RestController
public class Demo1Controller {
	@GetMapping("news/{id}")
	public News getNewsById(@PathVariable int id){
		News n1=new News(id,"(测试用:)骑士再擒猛龙4-0横扫 挺进东决詹姆斯35+9+6","andyjfzheng","腾讯体育5月8日讯 骑士客场以109-102击败缺少洛瑞的猛龙，总比分4-0横扫对手过关。他们将静待凯尔特人与奇才之间的胜者，进行东决的较量。詹姆斯本场比赛延续强势，贡献35分9篮板6助攻。同时在詹姆斯的带领下，骑士还创造了一个纪录，他们成为历史上首支连续两个赛季取得季后赛开局8连胜的球队。","2017-05-08 06:10");
		return n1;
	}
}
