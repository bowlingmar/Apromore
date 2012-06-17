/**
 * Copyright (c) 2011-2012 Felix Mannhardt
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * 
 * See: http://www.opensource.org/licenses/mit-license.php
 * 
 */
package de.hbrs.oryx.yawl.converter.handler.oryx;

import java.util.Set;

import org.oryxeditor.server.diagram.basic.BasicEdge;
import org.oryxeditor.server.diagram.basic.BasicShape;
import org.yawlfoundation.yawl.elements.YNet;

import de.hbrs.oryx.yawl.converter.context.OryxConversionContext;

/**
 * Converts a (sub)-net 
 * 
 * @author Felix Mannhardt (Bonn-Rhein-Sieg University of Applied Sciences)
 *
 */
public class OryxNetHandler extends OryxShapeHandler {

	public OryxNetHandler(OryxConversionContext context, BasicShape shape) {
		super(context, shape);
	}

	/* (non-Javadoc)
	 * @see de.hbrs.oryx.yawl.converter.handler.oryx.OryxHandler#convert()
	 */
	@Override
	public void convert() {
		String yawlId = convertYawlId(getShape());

		YNet net = new YNet(yawlId, getContext().getSpecification());
		convertLayout(net);
		convertProperties(net);
		getContext().addNet(getShape(), net);

		convertChildShapes();
		convertFlows();

		if (new Boolean(getShape().getProperty("isrootnet"))) {
			getContext().getSpecification().setRootNet(net);
		} else {
			getContext().getSpecification().setDecomposition(net);
		}
	}

	private void convertLayout(YNet net) {
		// TODO convert layout
	}

	private void convertProperties(YNet net) {
		net.setName(getShape().getProperty("name"));
		String variables = getShape().getProperty("decompositionvariables");
		if (variables != null) {
			// Convert all variables
		}
	}

	private void convertChildShapes() {
		for (BasicShape shape : getShape().getChildShapesReadOnly()) {
			OryxHandler handler = getContext().getHandlerFactory()
					.createOryxConverter(shape);
			handler.convert();
		}
	}

	private void convertFlows() {
		Set<BasicEdge> flowSet = getContext().getFlowSet(getShape());

		for (BasicEdge flowShape : flowSet) {
			OryxHandler handler = getContext().getHandlerFactory()
					.createOryxConverter(flowShape, getShape());
			handler.convert();
		}

	}
}