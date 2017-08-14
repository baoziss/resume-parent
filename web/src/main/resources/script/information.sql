CREATE TABLE information(
  id VARCHAR(40) PRIMARY KEY,
  name VARCHAR(40),
  sex INT(1),
  age INT(3),
  money VARCHAR(20),
  bir TIMESTAMP,
  degree VARCHAR(40),
  school VARCHAR(40),
  major VARCHAR(40),
  location VARCHAR(100),
  home_location VARCHAR(100),
  phone VARCHAR(20),
  email VARCHAR(40),
  self_introduce VARCHAR(200)
)
insert into information values(
  '1','吴龙涛',0,23,'5000~6000','1994-05-13','本科','河南大学','计算机科学与技术','上海市徐汇区',
  '河南洛阳','17839248230','505628125@qq.com',
  '* 河大社联游戏竞技大赛负责人之一。<br/>* 河大爱的罗曼斯校园歌手大赛负责人之一。<br/>* 互联网生态大会志愿者负责人之一。<br/><br/>* 踏实肯干，喜欢接受新知识。<br/>* 吃苦耐劳，热爱编程。<br/>* 喜欢团队工作。<br/>* 乐于分享知识，共同进步提高。<br/>* 喜爱音乐，性格活泼。<br/>* 刚刚毕业想找一份java开发工作。<br/>'
)