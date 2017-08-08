/**
 * 用户管理列表
 */
var userIndex={};
$(function(){
	userIndex.initTable();
	userIndex.validators();
	 
})
/**
 * 点击新增按钮事件
 */
userIndex.addUser=function(){
	form.reset('#userForm');//表单清空
	validator.reset(userIndex.params);//重置验证表单
	$("#saveModal").modal('show');//打开弹出窗
	$("#saveModal").draggable();//为模态对话框添加拖拽
	userIndex.url="";
}
/**
 * 表单验证
 */
userIndex.validators=function(){
	userIndex.params={
			id:'#userForm',
			fields:{
				userName: {
                    validators: {
                        notEmpty: {
                            message: '用户名不能为空'
                        }
                    }
                },
                password: {
                	validators: {
                		notEmpty: {
                			message: '密码不能为空'
                		}
                	}
                },
                userCode: {
                	validators: {
                		notEmpty: {
                			message: '用户账号不能为空'
                		}
                	}
                },
                departmentId: {
                	validators: {
                		notEmpty: {
                			message: '部门不能为空'
                		}
                	}
                },
			},
			success:userIndex.submit()
	}
	validator.init(userIndex.params);
}
/**
 * 表单提交
 */
userIndex.submit=function(){
	form.submit({
		id:"#userForm",
		url:userIndex.url,
		success:function(date){
			
		}
	});
}
var data=[{
	"userName":"小张",
	"userCode":"01",
	"departmentName":"研发部"
}];
/**
 * 初始化用户表格
 */
userIndex.initTable=function(){
	$("#userTable").bootstrapTable({
		data:data,
		//data:data,
        method:'post',					//请求方式
        toolbar:'#toolbar',				//工具按钮用哪个容器
        striped:true,					//是否显示行间隔色
        cache:false,					//是否使用缓存，默认为true
        pagination:true,				// 是否显示分页
        sortable:true,					// 是否启用排序
        sortOrder:'asc',				// 排序方式
      //  queryParams:queryParams,// 传递参数（*）
        sidePagination: "server",           // 分页方式：client客户端分页，server服务端分页（*）
        pageNumber:1,                       // 初始化加载第一页，默认第一页
        pageSize: 10,                       // 每页的记录行数（*）
        pageList: [5, 10, 15, 20],        // 可供选择的每页的行数（*）
        search: false,                       // 是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
        strictSearch: true,
        showColumns: true,                  // 是否显示所有的列
        showRefresh: true,                  // 是否显示刷新按钮
        minimumCountColumns: 2,             // 最少允许的列数
        clickToSelect: true,                // 是否启用点击选中行
        uniqueId: "id",                     // 每一行的唯一标识，一般为主键列
        showToggle:true,                    // 是否显示详细视图和列表视图的切换按钮
        cardView: false,                    // 是否显示详细视图
        detailView: false,                   // 是否显示父子表
        columns:[{
        	checkbox:true
        },{
        	field:'userName',
        	title:'用户名',
        	align:'center',
        	formatter:function(value,row,index){
        		if(value){
        			return value;
        		}else{
        			return "-";
        		}
        	}
        },{
        	field:'userCode',
        	title:'用户账号',
        	align:'center',
        	formatter:function(value,row,index){
        		if(value){
        			return value;
        		}else{
        			return "-";
        		}
        	}
        },{
        	field:'departmentName',
        	title:'部门名称',
        	align:'center',
        },{
        	field:'address',
        	title:'地址',
        	align:'center',
        },{
        	field:'email',
        	title:'邮箱',
        	align:'center',
        },{
        	field:'phone',
        	title:'联系电话',
        	align:'center',
        },{
        	title:'操作',
        	align:'center',
        	width:280,
        	formatter:function(value,row,index){
        		var id=row.id;
        		var btn="<input type='button' class='btn btn-primary btn-xs' value='编辑' onclick='updateUser("+id+")'/>\t" +
                		"<input  type='button' class='btn btn-primary btn-xs' value='删除' onclick='deleteUser("+id+")'/>\t";
        		return btn;
        	}
        }]
	});
}