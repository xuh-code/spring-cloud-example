// 单页应用 不重要的 路由配置
export default [
    {
        path: '/my',
        component: r => require.ensure([], () => r(require('@/pages/my/index/index')), 'my.index'),
		meta: {
			title: '我的'
		}
    },
    {
        path: '/product/detail',
        component: r => require.ensure([], () => r(require('@/pages/product/detail/detail')), 'product.detail'),
		meta: {
			title: '订单详情'
		}
    }
]
