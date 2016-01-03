

function confirm_delete(){
	return confirm("确定要删除数据吗？");
}

function short_content(length) {
	(function($){
		$('.short_content').each(function(){
			var obj = $(this);
			var source_str = obj.html().trim();
			var new_str = source_str.substr(0,length);
			if(source_str.length >length)
				new_str += "...";
			obj.html(new_str);
		});
	})(jQuery);
}


