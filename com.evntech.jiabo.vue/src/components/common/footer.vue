<template>
	<div>
		<footer id="footer">
			<div class="container">
				<div class="row footer-top  text-center">
					<div class="col-sm-6 col-md-3">
						<h4>微信咨询</h4>
						<p><img src="@/assets/images/wx-img.jpg" /></p>
					</div>
					<div class="col-sm-6 col-md-3">
						<h4>关于</h4>
						<p> <a href="/about.html">关于我们</a></p>
						<p> <a href="/about.html">关于我们</a></p>
						<p> <a href="/about.html">关于我们</a></p>
						<p> <a href="/about.html">关于我们</a></p>
						<p> <a href="/about.html">关于我们</a></p>
					</div>
					<div class="col-sm-6 col-md-3">
						<h4>淘宝店铺</h4>
						<p> <a href="/about.html">关于我们</a></p>
						<p> <a href="/about.html">关于我们</a></p>
						<p> <a href="/about.html">关于我们</a></p>
						<p> <a href="/about.html">关于我们</a></p>
						<p> <a href="/about.html">关于我们</a></p>
					</div>
					<div class="col-sm-6 col-md-3">
						<h4>友情链接</h4>
						<p> <a href="/about.html">关于我们</a></p>
						<p> <a href="/about.html">关于我们</a></p>
						<p> <a href="/about.html">关于我们</a></p>
						<p> <a href="/about.html">关于我们</a></p>
					</div>
				</div>
				<hr />
				<div class="row footer-bottom">
					<ul class="list-inline text-center">
						<li>
							<a href="http://www.miibeian.gov.cn" target="_blank">
								浙ICP备18018478号
							</a>
						</li>
					</ul>
				</div>
			</div>
		</footer>
	</div>
</template>

<script>
	export default {
		data() {
			return {

			};
		}
	}

	$(function() {
		function footerPosition() {
			$("footer").removeClass("fixed-bottom");
			var contentHeight = document.body.scrollHeight, //网页正文全文高度
				winHeight = window.innerHeight; //可视窗口高度，不包括浏览器顶部工具栏
			if (!(contentHeight > winHeight)) {
				//当网页正文高度小于可视窗口高度时，为footer添加类fixed-bottom
				$("footer").addClass("fixed-bottom");
			} else {
				$("footer").removeClass("fixed-bottom");
			}
		}
		footerPosition();
		$(window).resize(footerPosition);
	});
</script>
<style scoped>
	#footer{
		background: url(../../assets/images/animated-number/bg.jpg) no-repeat 0 0;
		background-size: cover;
		color: #fff;
	}
	
	#footer h4 {
		font-weight: 600;
		color: #FFFFFF;
	}

	#footer img {
		weight: 150px;
		height: 150px;
	}

	#footer .footer-bottom {
		font-size: 13px;
	}

	html,
	body {
		margin: 0;
		padding: 0;
	}

	header {
		background-color: #ffe4c4;
	}

	main {
		background-color: #bdb76b;
	}

	footer {
		background-color: #ffc0cb;
	}

	/* 动态为footer添加类fixed-bottom */
	.fixed-bottom {
		position: fixed;
		bottom: 0;
		width: 100%;
	}
</style>
