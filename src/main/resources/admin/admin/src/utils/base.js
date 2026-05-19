const base = {
    get() {
        return {
            url : "http://localhost:8081/springboot645433b2/",
            name: "springboot645433b2",
            // 退出到首页链接
            indexUrl: 'http://localhost:8081/springboot645433b2/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "生猪溯源管理系统"
        } 
    }
}
export default base
