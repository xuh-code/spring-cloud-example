import '@/assets/style/common.css'
import '@/assets/style/bootstrap.min.css'
import 'babel-polyfill'
import 'bootstrap'

import Vue from 'vue'
import VueRouter from 'vue-router'
import config from '@/common/config'
import routes from '@/router/router'
import store from '@/store'
import App from './App.vue'
import $ from 'jquery';

Vue.config.productionTip = false

Vue.use(VueRouter)

export default {
	init(component, title) {
		routes.push({
			path: location.pathname,
			component
		})

		const router = new VueRouter({
			mode: config.vueRouterMode,
			routes
		})

		router.afterEach(route => {
			// 从路由的元信息中获取 title 属性
			if (route.meta.title) {
				document.title = route.meta.title;
				// 如果是 iOS 设备，则使用如下 hack 的写法实现页面标题的更新
				if (navigator.userAgent.match(/\(i[^;]+;( U;)? CPU.+Mac OS X/)) {
					const hackIframe = document.createElement('iframe');
					hackIframe.style.display = 'none';
					hackIframe.src = '/path/fixIosTitle.html?r=' + Math.random();
					document.body.appendChild(hackIframe);
					setTimeout(() => {
						document.body.removeChild(hackIframe)
					}, 300)
				}
			}else{
				document.title = title
			}
		})

		new Vue({
			router,
			store,
			template: '<App/>',
			components: {
				App
			},
			created() {
				if (router.mode === 'hash' && !location.hash) {
					this.$router.push(location.pathname)
				}
			}
		}).$mount('#app')
	}
}
