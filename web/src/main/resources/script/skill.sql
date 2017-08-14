create table skill(
  id VARCHAR(40) PRIMARY KEY,--主键
  detail VARCHAR(200), --详细描述
  info_id VARCHAR(40) --所属简历
)

insert into skill values
(
  '1','熟练掌握java基础','1'
),
(
  '2','熟练掌握java web，掌握jsp，servlet以及jdbc开发步骤','1'
),
(
  '3','熟练使用struts2，了解struts2值栈，掌握struts2中JSP标签库的使用','1'
),
(
  '4','熟练使用mybatis，熟练编写mapper文件，熟练使用mybatis子查询，了解mybatis缓存','1'
),
(
  '5','熟练使用数据库mysql、oracle能够使用PowerDesigner进行项目库表设计','1'
),
(
  '6','熟练使用maven，通过maven构建项目，添加maven项目依赖','1'
),
(
  '7','熟悉spring，springmvc集成配置过程，了解springMVC工作流程，了解spring面向切面编程，以及依赖注入思想','1'
),
(
  '8','熟悉springMVC基于注解的发布rest风格服务','1'
),
(
  '9','熟悉linux常用基础指令','1'
),
(
  '10','了解nosql数据库如redis、mongodb','1'
)

