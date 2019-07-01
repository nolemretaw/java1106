/* 根据id查找元素 */
function $ (id) {
	return document.getElementById(id);
}
//根据id获取输入框中的内容
function $F(id) {
	return $(id).value;
}
//根据标签名创建DOM节点
function $M(tagName){
	return document.createElement(tagName);
}
//根据选择器查找单个元素
function $S(selector){
	return document.querySelector(selector);
}
//根据选择器查找多个元素
function $SAll(selector){
	return document.querySelectorAll(selector);
}
