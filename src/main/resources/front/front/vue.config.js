// var webpack = require('webpack');
//vue2
const path = require('path')
function resolve(dir) {
    return path.join(__dirname, dir)
}
function publicPath(){
    if (process.env.NODE_ENV == 'production') {
        return "././";
    } else {
        return "/";
    }
}
// vue.config.js
module.exports = {
    publicPath: publicPath(),
    configureWebpack: {
        resolve: {
            alias: {
                '@': resolve('src')
            }
        }
    },
    lintOnSave: false,
    devServer: {
        host: "0.0.0.0",
        port: 8082,
        hot: true,
        https: false,
        // ✅ 绝对正确代理配置
        proxy: {
            '/': {
                target: 'http://localhost:8081/springboot645433b2',
                changeOrigin: true,
                secure: false
            }
        }
    },
    chainWebpack(config) {
        config.module
            .rule('svg')
            .exclude.add(resolve('src/icons'))
            .end()
        config.module
            .rule('icons')
            .test(/\.svg$/)
            .include.add(resolve('src/icons'))
            .end()
            .use('svg-sprite-loader')
            .loader('svg-sprite-loader')
            .options({
                symbolId: 'icon-[name]'
            })
            .end()
    }
}