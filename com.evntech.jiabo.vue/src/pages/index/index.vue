<template>
	<div>
		<button class="btn btn-success">Success</button>
		<!-- Button trigger modal -->
		<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
			Launch demo modal
		</button>

		<!-- Modal -->
		<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
						<button type="button" class="close" data-dismiss="modal" aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="modal-body">
						...
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
						<button type="button" class="btn btn-primary">Save changes</button>
					</div>
				</div>
			</div>
		</div>
		<p>这里是 /pages/index/index.vue</p>
		<hr />
		<h3>模板中加载图片示例：</h3>
		<img src="@/assets/img/aa.png" width="80" />

		<hr />
		<h3>代码中加载图片示例：</h3>
		<div class="item" v-for="(item, index) in list">
			<a :href="item.link"><img :src="item.img" width="50" /></a>
		</div>

		<hr />
		<router-link to="/my">个人中心 (单页跳转)</router-link> <br />
		<a href="/product/list.html">产品列表 (多页跳转)</a>
	</div>
</template>

<script>
	import utils from '@/utils'

	export default {
		data() {
			return {
				list: [{
						link: "111",
						img: require('@/assets/img/aa.png')
					},
					{
						link: "555",
						img: require('@/assets/img/bb.png')
					},
				]
			}
		}
	}
</script>
