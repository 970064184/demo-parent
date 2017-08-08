var validator = {};
/**
 * 表单验证初始化
 */
validator.init = function(params){
	validator.cacheParams = params;
	$(params.id).bootstrapValidator({
        message: 'This value is not valid',
        excluded: ':disabled',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok validator-height',
            invalid: 'glyphicon glyphicon-remove validator-height',
            validating: 'glyphicon glyphicon-refresh validator-height'
        },
        fields: params.fields
	}).on('success.form.bv', function(e) {
		if(params.success){
			params.success();
		}
	})
}
/**
 * 表单验证清空
 */
validator.reset=function(params){
	$(params.id).data('bootstrapValidator').destroy();
    $(params.id).data('bootstrapValidator', null);
    validator.init(params);
}
/**
 * form表单提交
 */
var form={};
form.submit=function(params){
	var postData;
	postData=$(params.id).serialize();//提交的参数
	if(!params.contentType){
		params.contentType="application/x-www-form-urlencoded;charset=utf-8";
	}
	$.ajax({
		url:params.url,
		type:'POST',
		cache: false,
		data:postData,
		contentType:params.contentType,
		success:function(data){
			//保存成功
			
		},
		error:function(XMLHttpRequest, textStatus, errorThrown){
			//发生错误时
		}
	})
}
/**
 * 表单清空
 */
form.reset = function(id){
	$(':input',id)  
	 .not(':button, :submit, :reset,:radio,:checkbox')  
	 .val('');
	
	$(':input',id).removeAttr('checked')  
	 .removeAttr('selected');
}

var bootstrap={};
/**
 * 单按钮提示框
 */
bootstrap.show=function(){
	 BootstrapDialog.show({
	     title: 'Sign In',
	     message: 'Your sign-in form goes here.',
	     cssClass: 'login-dialog',
	     buttons: [{
	         label: 'Sign In Now!',
	         cssClass: 'btn-primary',
	         action: function(dialog){
	             dialog.close();
	         }
	     }]
	 });
}