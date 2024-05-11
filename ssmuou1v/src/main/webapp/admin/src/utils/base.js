const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmuou1v/",
            name: "ssmuou1v",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmuou1v/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "文章管理系统小程序"
        } 
    }
}
export default base
