import Vue from 'vue'
import Router from 'vue-router'
import NotFoundComponent from '@/components/HelloWorld'

Vue.use(Router)

export default new Router({
	mode: 'history',
	routes: [{
			path: '/',
			name: 'Header'
		},
		{
			path: '*',
			component: NotFoundComponent
		}
	]
})
